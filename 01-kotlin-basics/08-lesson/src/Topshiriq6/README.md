🧮 Matrix Generator in Kotlin
This Kotlin program creates an m x n matrix where each column is filled with the same list of m integers provided by the user.

📌 Problem Statement
Given:

Two positive integers m and n

A list of m integers

You need to generate a matrix of size m x n such that each column of the matrix is made up of the given m integers in the same order.

🔢 Example
Input:

makefile
Copy
Edit
m = 3
n = 2
Elements: [5, 10, 15]
Output:

Copy
Edit
5	5
10	10
15	15
🛠️ How It Works
The user is asked to enter:

The number of rows m

The number of columns n

Then the program takes m integer inputs and stores them in a 1D array.

Using nested loops:

Each row of the matrix is initialized with the corresponding element from the input array across all columns.

The matrix is printed in tab-separated format.

📄 Code Overview
kotlin
Copy
Edit
val matrix = Array(m) { IntArray(n) }
for (i in 0 until m) {
for (j in 0 until n) {
matrix[i][j] = arr[i]
}
}
This loop fills each row i of the matrix with the i-th element from the input array arr, repeated across all columns j.

▶️ How to Run
Make sure you have Kotlin installed, or run it using IntelliJ IDEA or any online Kotlin compiler.

bash
Copy
Edit
kotlinc MatrixGenerator.kt -include-runtime -d MatrixGenerator.jar
java -jar MatrixGenerator.jar
📬 Author
Bunyodjon Rakhmonov

Telegram: @RaxmonovBunyodjon