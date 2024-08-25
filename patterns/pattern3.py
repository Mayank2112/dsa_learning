# 1
# 12
# 123
# 1234
# 12345

noOfRows = int(input("Enter number of rows: "))
val = ""

for row in range(1, noOfRows + 1):
  val += str(row)
  print(val)
