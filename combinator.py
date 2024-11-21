import os

folder_path = input("Enter the path to the folder containing Java files: ")

output_file = input("Enter the name for the output text file (e.g., combined_java_files.txt): ")

if not os.path.isdir(folder_path):
    print("The provided path is not valid. Please check and try again.")
else:
    with open(output_file, 'w') as outfile:
        for filename in os.listdir(folder_path):
            if filename.endswith('.java'):
                file_path = os.path.join(folder_path, filename)
                with open(file_path, 'r') as infile:
                    outfile.write(infile.read())
                    outfile.write("\n\n")
    print(f"All Java files have been combined into '{output_file}'")
