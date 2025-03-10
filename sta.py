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


list = [85,95,61,51,77,87,39,48,78,40,47,55,88,44,101,92,71,41,61,50,48,57,102,95,88,65,53,66,97,87]

frequency_distribution(list)