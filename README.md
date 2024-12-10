# Assignment: Average Function Analysis

## Functional Description
The average function computes the arithmetic mean of the first k elements of an integer array list. If k exceeds the length of the array, the function calculates the mean of all elements in the array. If the array is empty (k = 0 or list.length = 0), the function returns 0.

---

## Functional Test Case
### Test Cases
| **Test Case**               | **Input**                         | **Expected Output**       |
|-----------------------------|-----------------------------------|---------------------------|
| Basic Case                  | k = 3, list = [2, 4, 6, 8]   | 4                       |
| Edge Case: k > list.length| k = 10, list = [1, 2, 3]     | 2                       |
| Empty List                  | k = 5, list = []             | 0                       |
| Single Element              | k = 1, list = [42]          | 42                      |
| Zero k Value              | k = 0, list = [1, 2, 3]     | 0                       |

---

## Partitions and Partition Test Cases
### Partitions
1. k = 0 (Invalid input)
2. k > list.length
3. k <= list.length
4. Empty array (list.length = 0)
5. Single-element array (list.length = 1)

### Partition Test Cases
| **Test Case**               | **Input**                         | **Expected Output**       |
|-----------------------------|-----------------------------------|---------------------------|
| Invalid Input               | k = 0, list = [10, 20, 30]   | 0                       |
| k > list.length           | k = 5, list = [1, 2]         | 1.5 (rounded to 1)    |
| k <= list.length          | k = 3, list = [1, 2, 3, 4]   | 2                       |
| Empty Array                 | k = 1, list = []             | 0                       |
| Single-element Array        | k = 1, list = [7]            | 7                       |

---

## Boundary Value Test Cases
| **Boundary Condition**          | **Input**                         | **Expected Output**       |
|---------------------------------|-----------------------------------|---------------------------|
| Minimum size: k = 1           | k = 1, list = [1]            | 1                      |
| Maximum k = list.length       | k = 4, list = [10, 20, 30, 40]| 25                      |
| Exceeding: k = list.length + 1`| k = 5, list = [10, 20, 30, 40]`| 25                      |
| Empty array                     | k = 1, list = []             | 0                       |
| Zero k                        | k = 0, list = [1, 2, 3]      | 0                       |

---

## Code Implementation and JUnit Test Cases
### Average Class Implementation
```java
public class Average {
    public int average(int k, int[] list) {
        int average = 0;
        int n = Math.min(k, list.length);
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                average += list[i];
            }
            average = average / n;
        }
        return average;
    }
```
# Fault Injection and Error Analysis

1. Injected Fault: Modify i = 0 to i = 1 in the for-loop.
2. Expected Failure: The function skips the first element of the array during computation.
   - Input: k = 3, list = [2, 4, 6, 8]
   - Expected Output: 4
   - Actual Output: 5 (average of [4, 6])
3. Fix: Restore i = 0.
4. basic() and exceeds() both did not work while the rest did
5. single(), empty(), zero() still worked
- Fault: Using Math.max instead of Math.min causes the function to use an incorrect number of elements when calculating the average.

# Code Coverage
<img width="958" alt="test" src="https://github.com/user-attachments/assets/736c21bf-2448-44fb-9f33-7f13075e6fe8">


