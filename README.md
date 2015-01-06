# Word Frequency

## The brief
For the following task, please develop code that is both production quality code and fully unit-tested.

Write a solution that counts the number of occurrences of words in given Strings. The number of occurrences of each word should be stored in a HashMap. For example if the String `the man in the moon` is passed in then the HashMap will contain:  
         
        “the”:	2  
        “man”:	1  
        “in”:	1     
        “moon”:	1

If subsequently the String `the man on the moon` is passed in then the HashMap will now contain:  

        “the”:	4
        “man”:	2
        “in”:	1
        “on”:	1
        “moon”:	2

All input should be validated to prevent empty or null Strings being processed – appropriate exceptions should be thrown in these scenarios.

The solution should also be thread-safe so that occurrences are correctly updated when concurrently invoked.

## The approach
You will be provided with a skeletal interface solution.