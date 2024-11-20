import os

# Ask for the folder containing the Java files
folder_path = input("Enter the path to the folder containing Java files: ")

# Ask for the name of the output file
output_file = input("Enter the name for the output text file (e.g., combined_java_files.txt): ")

# Ensure the folder path is valid
if not os.path.isdir(folder_path):
    print("The provided path is not valid. Please check and try again.")
else:
    # Open the output file in write mode
    with open(output_file, 'w') as outfile:
        # Loop through all files in the directory
        for filename in os.listdir(folder_path):
            # Check if the file is a Java file
            if filename.endswith('.java'):
                file_path = os.path.join(folder_path, filename)
                
                # Open each Java file and append its content to the output file
                with open(file_path, 'r') as infile:
                    outfile.write(infile.read())  # Write the content of the file
                    outfile.write("\n\n")  # Add an empty line between files

    print(f"All Java files have been combined into '{output_file}'")
