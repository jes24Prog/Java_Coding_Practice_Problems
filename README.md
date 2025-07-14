# Java Coding Practice Problems

---

## 🧵 String Problems

### 1. Reverse a String
- **File:** `ReverseString.java`
- **Input:** `"hello"`
- **Output:** `"olleh"`

### 2. Check if a String is Palindrome
- **File:** `IsPalindrome.java`
- **Input:** `"racecar"`
- **Output:** `true`

### 3. Count Vowels and Consonants
- **File:** `CountVowelsConsonants.java`
- **Input:** `"Hello World"`
- **Output:** `Vowels: 3, Consonants: 7`

### 4. Find First Non-Repeating Character
- **File:** `FirstUniqueCharacter.java`
- **Input:** `"swiss"`
- **Output:** `"w"`

### 5. Check Anagram Strings
- **File:** `AreAnagrams.java`
- **Input:** `"listen", "silent"`
- **Output:** `true`

### 6. String Compression
- **File:** `StringCompression.java`
- **Input:** `"aabcccccaaa"`
- **Output:** `"a2b1c5a3"`

---

## 🔢 Array & Matrix Problems

### 1. Find Largest and Smallest Element
- **File:** `MinMaxArray.java`
- **Instructions:** Find and print the minimum and maximum element in an array.
- **Input:** `[3, 5, 1, 9, 2]`
- **Output:** `Min: 1, Max: 9`

---

### 2. Remove Duplicates from Sorted Array
- **File:** `RemoveDuplicates.java`
- **Instructions:** Given a sorted array, remove the duplicates in-place and return the new length.
- **Input:** `[1, 1, 2, 2, 3]`
- **Output:** `[1, 2, 3]`

---

### 3. Rotate Array by K Steps
- **File:** `RotateArray.java`
- **Instructions:** Rotate the elements of an array to the right by `k` steps.
- **Input:** `[1, 2, 3, 4, 5, 6, 7], k = 3`
- **Output:** `[5, 6, 7, 1, 2, 3, 4]`

---

### 4. Find Missing Number
- **File:** `MissingNumber.java`
- **Instructions:** Find the missing number from 1 to n in an array.
- **Input:** `[1, 2, 4, 5], n = 5`
- **Output:** `3`

---

### 5. Find All Pairs with Given Sum
- **File:** `PairSum.java`
- **Instructions:** Find all unique pairs in the array that sum up to a given target.
- **Input:** `[1, 2, 3, 4, 5], sum = 6`
- **Output:** `[(1,5), (2,4)]`

---

### 6. Sort Array of 0s, 1s, and 2s (Dutch National Flag Problem)
- **File:** `SortColors.java`
- **Instructions:** Sort an array containing only 0s, 1s, and 2s without using any sorting function.
- **Input:** `[2, 0, 2, 1, 1, 0]`
- **Output:** `[0, 0, 1, 1, 2, 2]`

---

### 7. Merge Two Sorted Arrays
- **File:** `MergeSortedArrays.java`
- **Instructions:** Merge two sorted arrays into one sorted array.
- **Input:** `[1,3,5]`, `[2,4,6]`
- **Output:** `[1,2,3,4,5,6]`

---

### 8. Kadane’s Algorithm (Max Subarray Sum)
- **File:** `MaxSubarraySum.java`
- **Instructions:** Find the maximum sum of a contiguous subarray.
- **Input:** `[-2, 1, -3, 4, -1, 2, 1, -5, 4]`
- **Output:** `6`

---

### 9. Spiral Order Matrix Traversal
- **File:** `SpiralMatrix.java`
- **Instructions:** Print all elements of a matrix in spiral order.
- **Input:** `[[1,2,3],[4,5,6],[7,8,9]]`
- **Output:** `[1,2,3,6,9,8,7,4,5]`

---

### 10. Transpose a Matrix
- **File:** `TransposeMatrix.java`
- **Instructions:** Transpose the given matrix (swap rows with columns).
- **Input:** `[[1,2,3],[4,5,6]]`
- **Output:** `[[1,4],[2,5],[3,6]]`

---

### 11. Search in a Sorted 2D Matrix
- **File:** `SearchMatrix.java`
- **Instructions:** Search for a target value in a 2D matrix. Each row is sorted left to right, and each column top to bottom.
- **Input:** `[[1,3,5],[7,9,11]], target = 9`
- **Output:** `true`

---

### 12. Set Matrix Zeroes
- **File:** `SetMatrixZeroes.java`
- **Instructions:** If an element in a matrix is 0, set its entire row and column to 0 (in-place).
- **Input:** `[[1,1,1],[1,0,1],[1,1,1]]`
- **Output:** `[[1,0,1],[0,0,0],[1,0,1]]`

---

### 13. Diagonal Traversal of Matrix
- **File:** `DiagonalTraverse.java`
- **Instructions:** Traverse a matrix in a zigzag diagonal pattern.
- **Input:** `[[1,2,3],[4,5,6],[7,8,9]]`
- **Output:** `[1,2,4,7,5,3,6,8,9]`

---

### 14. Matrix Multiplication
- **File:** `MatrixMultiplication.java`
- **Instructions:** Multiply two matrices and return the result.
- **Input:** `A=[[1,2],[3,4]], B=[[2,0],[1,2]]`
- **Output:** `[[4,4],[10,8]]`

---

### 15. Find Duplicate Number
- **File:** `FindDuplicate.java`
- **Instructions:** Given an array of n+1 integers where each integer is in [1, n], find the duplicate number.
- **Input:** `[3,1,3,4,2]`
- **Output:** `3`

---

### 16. Majority Element (> n/2 times)
- **File:** `MajorityElement.java`
- **Instructions:** Find the element that appears more than ⌊n/2⌋ times.
- **Input:** `[2,2,1,1,1,2,2]`
- **Output:** `2`

---

### 17. Product of Array Except Self
- **File:** `ProductExceptSelf.java`
- **Instructions:** Return an array such that each element is the product of all elements except itself.
- **Input:** `[1,2,3,4]`
- **Output:** `[24,12,8,6]`

---

### 18. Subarray Sum Equals K
- **File:** `SubarraySumK.java`
- **Instructions:** Count the number of subarrays whose sum equals `k`.
- **Input:** `[1,2,3], k = 3`
- **Output:** `2`

---

### 19. Find Equilibrium Index
- **File:** `EquilibriumIndex.java`
- **Instructions:** Find index such that the sum of elements at lower indexes is equal to the sum at higher indexes.
- **Input:** `[-7,1,5,2,-4,3,0]`
- **Output:** `3`

---

### 20. Rearrange Array Alternating Positive and Negative
- **File:** `RearrangePositiveNegative.java`
- **Instructions:** Rearrange the array so that positive and negative numbers alternate, preserving order.
- **Input:** `[1, 2, 3, -4, -1, 4]`
- **Output:** `[-4, 1, -1, 2, 3, 4]`

---

## 🔁 Recursion & Backtracking

### 1. Factorial of a Number
- **File:** `Factorial.java`
- **Input:** `5`
- **Output:** `120`

### 2. Fibonacci Series
- **File:** `Fibonacci.java`
- **Input:** `6`
- **Output:** `0 1 1 2 3 5`

### 3. Generate All Subsets
- **File:** `PowerSet.java`
- **Input:** `[1, 2]`
- **Output:** `[[], [1], [2], [1,2]]`

### 4. Permutations of a String
- **File:** `StringPermutations.java`
- **Input:** `"abc"`
- **Output:** `["abc", "acb", "bac", "bca", "cab", "cba"]`

---

## 🧱 Object-Oriented Programming (OOP)

### 1. Bank Account System
- **File:** `BankAccount.java`
- **Input:** `deposit(1000)`, `withdraw(300)`
- **Output:** `Balance: 700`

### 2. Shape Area (Inheritance)
- **File:** `ShapeArea.java`
- **Input:** `Circle(3)`, `Rectangle(2, 4)`
- **Output:** `Area: 28.27, 8`

---

## 📦 Data Structures

### 1. Stack Using Array
- **File:** `StackArray.java`
- **Input:** `push(10), pop()`
- **Output:** `10`

### 2. Queue Using LinkedList
- **File:** `QueueLinkedList.java`
- **Input:** `enqueue(5), dequeue()`
- **Output:** `5`

### 3. LRU Cache
- **File:** `LRUCache.java`
- **Input:** `put(1,1), put(2,2), get(1), put(3,3)`
- **Output:** `Evicts key 2`

---

## 🔍 Searching & Sorting Algorithms

### 1. Binary Search
- **File:** `BinarySearch.java`
- **Input:** `[1, 3, 5, 7], target = 5`
- **Output:** `Index: 2`

### 2. Merge Sort
- **File:** `MergeSort.java`
- **Input:** `[4, 1, 5, 2]`
- **Output:** `[1, 2, 4, 5]`

---

## 🧮 Math & Number Theory

### 1. Prime Number Check
- **File:** `IsPrime.java`
- **Input:** `17`
- **Output:** `true`

### 2. GCD and LCM
- **File:** `GCDLCM.java`
- **Input:** `12, 18`
- **Output:** `GCD: 6, LCM: 36`

### 3. Count Digits in a Number
- **File:** `CountDigits.java`
- **Input:** `12345`
- **Output:** `5`

---

## 🧠 Dynamic Programming

### 1. Longest Common Subsequence (LCS)
- **File:** `LongestCommonSubsequence.java`
- **Input:** `"abcde", "ace"`
- **Output:** `3`

### 2. 0/1 Knapsack
- **File:** `Knapsack01.java`
- **Input:** `weights = [1, 3, 4], values = [15, 20, 30], W = 4`
- **Output:** `30`

---

## 📊 Tree & Graph Problems

### 1. Inorder Traversal
- **File:** `InorderTraversal.java`
- **Input:** `[1,null,2,3]`
- **Output:** `[1,3,2]`

### 2. Level Order Traversal
- **File:** `LevelOrderTraversal.java`
- **Input:** `[3,9,20,null,null,15,7]`
- **Output:** `[[3],[9,20],[15,7]]`

---

## 🧪 Miscellaneous

### 1. Read File Line by Line
- **File:** `ReadFile.java`
- **Input:** `"sample.txt"`
- **Output:** `Each line printed`

### 2. Multithreading Counter
- **File:** `ThreadCounter.java`
- **Input:** `Thread 1 and 2 incrementing`
- **Output:** `Final Counter Value: 2000`

---

