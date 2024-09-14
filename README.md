# Output Values Below An Amount
![Github license](https://img.shields.io/badge/mit-blue.svg)
 
 Licensing: [mit](https://choosealicense.com/licenses/mit/)

## Table of Contents
- [Description](#description)
- [Installation Requirements](#installation-requirements)
- [Application Usage](#application-usage)
- [License](#licensing-information)
- [Contributions](#contributions)
- [Tests Commands](#tests-commands)
- [Questions](#questions)

## Description
The OutputValuesBelowAnAmount program allows users to input an integer representing the number of values to be entered, followed by the actual values themselves, and finally a threshold value. The program stores the inputted numbers in arrays and compares each number against the threshold. It then outputs all values from the list that are smaller than the specified threshold.

## Installation Requirements
Ensure you have Java Development Kit (JDK) installed on your system. You can download it from [Oracle](https://www.oracle.com/java/technologies/downloads/) or use a package manager like Homebrew for macOS or apt-get for Linux. 

- Clone or download the repository: 
```Java 
- git clone https://github.com/EMK2473/OutputValuesBelowAnAmount.git 
```

- Navigate to the project directory: 
```Java
- cd OutputValuesBelowAnAmount 
```
- Compile the OutputValuesBelowAnAmount.java file: 
```Java
- javac OutputValuesBelowAnAmount.java 
```
- Run the program: 
```Java
- java OutputValuesBelowAnAmount
```

## Application Usage
Once the program is running, you will be prompted to input an integer to represent the number of values, followed by the integers, with the final input being the threshold value. All inputs should be entered on one line, separated by spaces.

- The first integer specifies how many values will follow.
- The subsequent integers are the values to be compared.
- The final integer is the threshold value.

The program will then compare each of the input values against the threshold and output only the numbers that are smaller than the threshold, separated by commas. Example: 

Input:
```Java
4 10 20 30 40 25 
```

- Number of inputs: 4
- Inputs: 10 20 30 40
- Threshold: 25

Output:
```Java
10,20,
```

## Contributions
Eric Keeton

## Test Commands
Test the program with different list sizes and thresholds to ensure proper functionality.

## Questions
For Questions, contact me at emk2473@gmail.com or visit My Github: [EMK2473](https://github.com/EMK2473)