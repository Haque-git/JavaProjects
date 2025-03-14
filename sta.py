import math

def frequency_distribution(data):
    data.sort()
    
    max_value = max(data)
    min_value = min(data)
    data_range = max_value - min_value
    
    class_count = round(1 + 3.322 * math.log10(len(data)))
    class_width = math.ceil(data_range / class_count)
    
    class_intervals = [min_value + i * class_width for i in range(class_count + 1)]
    
    freq_dict = {(class_intervals[i], class_intervals[i + 1]): 0 for i in range(len(class_intervals) - 1)}

    
    for value in data:
        for i in range(len(class_intervals) - 1):
            if class_intervals[i] <= value < class_intervals[i + 1]:
                freq_dict[(class_intervals[i], class_intervals[i + 1])] += 1
                break


    print("Max:", max_value)
    print("Min:", min_value)
    print("Range:", data_range)
    print("Class count:", class_count)
    print("Class width:", class_width)
    
    print("Class intervals:")
    for i in range(len(class_intervals) - 1):
        print(f"{class_intervals[i]} - {class_intervals[i + 1]}")
    
    print("Frequency distribution:")
    for key, value in freq_dict.items():
        print(f"{key}: {value}")

    

    relative_freq_dict = {(class_intervals[i], class_intervals[i + 1]): 0 for i in range(len(class_intervals) - 1)}
    
    for key, value in freq_dict.items():
        relative_freq_dict[key] = value / len(data)

    print("Relative frequency distribution:")
    for key, value in relative_freq_dict.items():
        print(f"{key}: {value}")

    cumulative_freq_dict = {(class_intervals[i], class_intervals[i + 1]): 0 for i in range(len(class_intervals) - 1)}

    cumulative_freq = 0
    for key, value in freq_dict.items():
        cumulative_freq += value
        cumulative_freq_dict[key] = cumulative_freq

    print("Cumulative frequency distribution:")
    for key, value in cumulative_freq_dict.items():
        print(f"{key}: {value}")

    pi_chart = {(class_intervals[i], class_intervals[i + 1]): 0 for i in range(len(class_intervals) - 1)}

    for key, value in freq_dict.items():
        pi_chart[key] = (value / len(data))*360

    print("Pi chart(in degree):")
    for key, value in pi_chart.items():
        print(f"{key}: {value}")

    cumulative_relative_freq_dict = {(class_intervals[i], class_intervals[i + 1]): 0 for i in range(len(class_intervals) - 1)}

    cumulative_relative_freq = 0
    for key, value in relative_freq_dict.items():
        cumulative_relative_freq += value
        cumulative_relative_freq_dict[key] = cumulative_relative_freq

    print("Cumulative relative frequency distribution:")
    for key, value in cumulative_relative_freq_dict.items():
        print(f"{key}: {value}")

    fi_xi_dict = {(class_intervals[i], class_intervals[i + 1]): 0 for i in range(len(class_intervals) - 1)}

    for key, value in freq_dict.items():
        fi_xi_dict[key] = ((key[0] + key[1]) / 2) * value

    print("fi*xi distribution:")
    for key, value in fi_xi_dict.items():
        print(f"{key}: {value}")

    sum_fi_xi = 0
    for key, value in fi_xi_dict.items():
        sum_fi_xi += value

    print("Sum of fi*xi:", sum_fi_xi)

    sum_fi = 0
    for key, value in freq_dict.items():
        sum_fi += value
    
    print("Sum of fi:", sum_fi)

    mean = sum_fi_xi / sum_fi
    print("Mean:", mean)

    mean_deviation = 0
    for key, value in freq_dict.items():
        mean_deviation += abs((key[0] + key[1]) / 2 - mean) * value

    print("sum of abs(fi*(xi-xbar)):", mean_deviation)

    mean_deviation = mean_deviation / sum_fi
    print("Mean deviation:", mean_deviation)

    variance = 0
    for key, value in freq_dict.items():
        variance += ((key[0] + key[1]) / 2 - mean) ** 2 * value
    
    print("sum of abs(fi*(xi-xbar))^2:", variance)
    
    variance = variance / (sum_fi - 1)
    print("Variance:", variance)




    median_class = None
    for key, value in cumulative_freq_dict.items():
        if value >= len(data) / 2:
            median_class = key
            break
    l_median_class = median_class[0]
    cf = cumulative_freq_dict[median_class]
    f = freq_dict[median_class]
    h = class_width

    print("Median class:", median_class)
    print("Lower boundary:", l_median_class)
    print("cumulative frequncy:", cf)
    print("frequency:", f)
    print("class width:", h)
    print("n/2:", len(data) / 2)

    print("formula: L + ((n/2 - cf) / f) * h")

    median = l_median_class + (((len(data) / 2) - cf) / f) * h
    print("Median:", median)


    mode_class = None
    max_freq = max(freq_dict.values())
    for key, value in freq_dict.items():
        if value == max_freq:
            mode_class = key
            break
    
    l_mode_class = mode_class[0]
    f1 = freq_dict[mode_class]
    if mode_class[0] - class_width < min_value:
        f0 = 0
    else:
        f0 = freq_dict[(mode_class[0] - class_width, mode_class[0])]
    f2 = freq_dict[(mode_class[1], mode_class[1] + class_width)]
    h = class_width

    print("Mode class:", mode_class)
    print("Lower boundary:", l_mode_class)
    print("frequency of the modal class(f1):", f1)
    print("frequency of the class preceding the modal class(f0):", f0)
    print("the frequency of the class succeeding the modal class(f2):", f2)
    print("class width:", h)
    print("formula: L + ((f1 - f0) / (2 * f1 - f0 - f2)) * h")
    
    mode = l_mode_class + ((f1 - f0) / (2 * f1 - f0 - f2)) * h
    print("Mode:", mode)

    def partition(data, n):
        result = []
        for i in range(1, n):
            partition_class = None
            for key, value in cumulative_freq_dict.items():
                if value >= len(data) * i / 10:
                    partition_class = key
                    break
            l_partition_class = partition_class[0]
            if l_partition_class - class_width < min_value:
                cf = 0
            else:
                cf = cumulative_freq_dict[(l_partition_class - class_width, l_partition_class)]
            f = freq_dict[partition_class]
            h = class_width

            print(f"partition {i} class:", partition_class)
            print("Lower boundary:", l_partition_class)
            print("cumulative frequncy:", cf)
            print("frequency:", f)
            print("class width:", h)
            print("n/10:", len(data) * i / 10)

            print("formula: L + ((n/10 - cf) / f) * h")

            decile = l_partition_class + (((len(data) * i / 10) - cf) / f) * h
            print(f"partition {i}:", decile)
            result.append(decile)
        return result
    
    print("--------------------------deciles--------------------------")
    deciles = partition(data, 10)
    print("--------------------------quartiles--------------------------")
    quartile = partition(data, 4)
    
    





def mean(data):
    return sum(data) / len(data)

def mean_deviation(data):
    x_bar = mean(data)
    print("mean", x_bar)
    total = sum([abs(x - x_bar) for x in data])
    print("sum of abs(x-xbar)", total)
    print("N", len(data))
    mean_deviation = total / len(data)
    print("mean deviation", mean_deviation)
    return mean_deviation

def variance(data):
    x_bar = mean(data)
    print("mean", x_bar)
    total = sum([(x - x_bar) ** 2 for x in data])
    print("sum of (x-xbar)^2", total)
    print("N", len(data))
    variance = total / (len(data) - 1)
    print("variance", variance)
    return variance

def median(data):
    data.sort()
    n = len(data)
    if n % 2 == 0:
        return (data[n // 2] + data[n // 2 + 1]) / 2
    else:
        return data[n // 2]
    
def mode(data):
    freq_dict = {value: 0 for value in data}
    for value in data:
        freq_dict[value] += 1
    max_freq = max(freq_dict.values())
    mode = [key for key, value in freq_dict.items() if value == max_freq]
    return mode


def partition(data, n):
    data.sort()
    num_of_observation = len(data)
    partitions = []
    for i in range(1, n):
        magic_number = num_of_observation * i / n
        if type(magic_number) == int:
            if magic_number-1 != num_of_observation:
                partition = (data[magic_number-1] + data[magic_number]) / 2
            else:
                partition = (data[magic_number-1])
            partitions.append(partition)
        else:
            partition = data[math.ceil(magic_number)]
            partitions.append(partition)
        print(f"partition {i}:", partition)
    return partitions



list = [85,95,61,51,77,87,39,48,78,40,47,55,88,44,101,92,71,41,61,50,48,57,102,95,88,65,53,66,97,87]

male = [85,95,77,48,78,40,55,101,71,61,50,57,88,53,97,87]

female = [61,51,87,39,47,88,44,92,41,48,102,95,65,66]


frequency_distribution(l)
