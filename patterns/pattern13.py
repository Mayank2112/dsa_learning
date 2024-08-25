# 1
# 2 3
# 4 5 6
# 7 8 9 10
# 11 12 13 14 15

noOfRows = int(input("Enter number of rows: "))
val = 0

for row in range(noOfRows):
  curr = ""
  for i in range(row + 1):
    val += 1
    curr += str(val) + " "
  print(curr)
