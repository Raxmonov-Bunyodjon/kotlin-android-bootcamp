# 🧮 Last Odd Number Addition in Kotlin

This Kotlin program takes a list of integers from the user, identifies the **last odd number** in the list, and **adds it to every odd number** in the array. If there are no odd numbers, the array remains unchanged.

---

## 📌 Task Description

- Input: A list of `N` integers from the user.
- Goal: Find the **last odd number** in the list.
- Process: Add this odd number to **each odd element** in the list.
- Output: A modified list with updated odd numbers (or unchanged if no odd numbers are present).

---

## 🛠️ Technologies Used

- Kotlin (JVM)
- Standard I/O (`Scanner`)
- Mutable Lists

---

## ▶️ Example

### Input:
Number of integers: 5
Enter 5 integers:
4 7 3 8 6



### Processing:
- Last odd number: `3`
- Odd numbers: `7`, `3`
- Updated odd numbers: `7 + 3 = 10`, `3 + 3 = 6`

### Output:
[4, 10, 6, 8, 6]