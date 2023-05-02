numberOfObjects, maxWeight = map(int, input().split())
listOfObjects = []

temp = input().split()
for value in temp:
    listOfObjects.append([float(value)])

temp = input().split()
for i in range(numberOfObjects):
    listOfObjects[i].append(float(temp[i]))
    listOfObjects[i].append(float(listOfObjects[i][0] / float(temp[i])))

sortedListOfObjects = sorted(listOfObjects, key=lambda x: x[2], reverse=True)
sumOfValues = 0

for temp in sortedListOfObjects:
    if temp[1] <= maxWeight:
        sumOfValues += temp[0]
        maxWeight -= temp[1]
    else:
        sumOfValues += temp[0] * (maxWeight / temp[1])
        maxWeight = 0

print(sumOfValues)
