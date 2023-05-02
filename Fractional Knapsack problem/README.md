Solution made using the Greedy method.
The data is retained in the form [[value_1, weight_1, value_1/weight1], ...]

A correct input would look like this:

5 7

10 5 8 3 15

2 5 3 2 3

- the first row contains the number of objects and the maximum allowed weight
- the second row, the value for each object
- the third row, the weight corresponding to each object

After the data is retained, a sorting of the "listOfObjects" is done, in descending order, according to the 'value/weight' value.
Then it goes through the sorted list, checking how the objects fit together and updating the value and weight after each added object/fraction of an object.

Output for the example:

30.333333333333332
