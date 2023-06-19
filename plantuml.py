import plantuml

def generate_uml(plantuml_code, output_path):
    plantuml_server = plantuml.PlantUML(url='http://www.plantuml.com/plantuml/img/')
    plantuml_server.processes_file(plantuml_code, output_path)

def main():
    # Prompt user for the input and output filenames
    input_file = input("Enter the PlantUML input file name: ")
    output_file = input("Enter the output file name (with extension): ")

    # Read the PlantUML code from the input file
    with open(input_file, 'r') as f:
        plantuml_code = f.read()

    # Generate the UML diagram
    generate_uml(plantuml_code, output_file)
    print(f"UML diagram generated at: {output_file}")

if __name__ == '__main__':
    main()
