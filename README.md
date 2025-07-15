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

## 🧱 Object-Oriented Programming (OOP) Problems

---

### 1. Create a Bank Account Class
- **File:** `BankAccount.java`
- **Instructions:** Create a class `BankAccount`.
- **Input:** `Deposit: 500`, `Withdraw: 200`
- **Output:** `Balance: 300`

---

### 2. Implement a Student Management System
- **File:** `StudentManagement.java`
- **Instructions:** Create a `Student` class with `id`, `name`, and `grade`. Add a method to print student details. Then, in another class, manage a list of students and support adding, removing, and listing students.
- **Input:** `Add student: John, ID: 1, Grade: A`
- **Output:** `Student Added: John (1), Grade: A`

---

### 3. Design an Employee Inheritance Structure
- **File:** `EmployeeInheritance.java`
- **Instructions:** Create a base class `Employee` with common attributes. Then create subclasses `Manager` and `Developer` that extend `Employee` and override a `getRole()` method.
- **Input:** `Create Developer and Manager objects`
- **Output:** `Developer: Alice`, `Manager: Bob`

---

### 4. Library Book System with Encapsulation
- **File:** `LibraryBook.java`
- **Instructions:** Create a `Book` class with private fields: `title`, `author`, and `available`. Add getters/setters and a method to `borrow()` or `return()` the book.
- **Input:** `Borrow 'Clean Code'`
- **Output:** `Borrowed successfully`

---

### 5. Shape Area using Abstraction
- **File:** `ShapeArea.java`
- **Instructions:** Create an abstract class `Shape` with an abstract method `getArea()`. Implement subclasses `Circle` and `Rectangle` and override the `getArea()` method.
- **Input:** `Circle radius: 2`, `Rectangle: 2x3`
- **Output:** `Area of Circle: 12.56`, `Area of Rectangle: 6`

---

### 6. Animal Sound Using Polymorphism
- **File:** `AnimalSound.java`
- **Instructions:** Create a base class `Animal` with a method `makeSound()`. Extend it with `Dog` and `Cat`, and override `makeSound()` to print their respective sounds.
- **Input:** `Call makeSound() on Dog and Cat`
- **Output:** `Woof`, `Meow`

---

### 7. Interface Example: Vehicle
- **File:** `VehicleInterface.java`
- **Instructions:** Create a `Vehicle` interface with methods `start()` and `stop()`. Implement it in classes `Car` and `Bike`.
- **Input:** `Start and stop car and bike`
- **Output:** `Car started`, `Bike stopped`

---

### 8. Constructor Overloading
- **File:** `ConstructorOverloading.java`
- **Instructions:** Create a `Book` class with overloaded constructors for setting different combinations of fields like title, author, and year.
- **Input:** `new Book("Java Basics")`, `new Book("Java", "John", 2020)`
- **Output:** Printed Book details with different constructors

---

### 9. Static Members Usage
- **File:** `StaticExample.java`
- **Instructions:** Demonstrate use of static variables and methods in a class. Track number of objects created using a static counter.
- **Input:** `Create 3 objects`
- **Output:** `Total objects: 3`

---

### 10. Method Overloading Example
- **File:** `MethodOverloading.java`
- **Instructions:** Create a class `Calculator` that overloads the method `add()` to support 2 or 3 integer parameters.
- **Input:** `add(2,3)`, `add(1,2,3)`
- **Output:** `5`, `6`

---

### 11. Real-World Example: Shopping Cart System
- **File:** `ShoppingCart.java`
- **Instructions:** Create `Product`, `CartItem`, and `Cart` classes. The cart should support adding products, calculating totals, and printing receipt.
- **Input:** `Add 2x Phone ($500), 1x Charger ($50)`
- **Output:** `Total: $1050`

---

### 12. Abstract Class vs Interface Demo
- **File:** `AbstractVsInterface.java`
- **Instructions:** Demonstrate the difference between abstract classes and interfaces using a `Payment` abstract class and a `DigitalPayable` interface.
- **Input:** `Call pay() on CreditCard and PayPal`
- **Output:** `Paid via CreditCard`, `Paid via PayPal`

---

### 13. Encapsulation with Validation
- **File:** `UserProfile.java`
- **Instructions:** Create a `UserProfile` class with fields `username`, `age`, `email` and use setters with input validation (e.g., age must be ≥ 13).
- **Input:** `Set age = 10`
- **Output:** `Invalid age! Must be ≥ 13`

---

### 14. Composition vs Inheritance
- **File:** `CompositionVsInheritance.java`
- **Instructions:** Create a `Person` class that has an `Address` object (composition). Also create an `Employee` class that extends `Person`.
- **Input:** `Create Employee with address`
- **Output:** `Employee John lives at 123 Street`

---

### 15. Override `toString()` Method
- **File:** `ToStringOverride.java`
- **Instructions:** Create a class and override its `toString()` method to return a custom string format.
- **Input:** `Print object`
- **Output:** `Person{name='John', age=30}`

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

