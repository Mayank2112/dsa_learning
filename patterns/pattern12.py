# 1        1
# 12      21
# 123    321
# 1234  4321
# 1234554321

noOfRows = int(input("Enter number of rows: "))

def prepareRowData(rowNo, totalRows):
  val = ""
  for counter in range(1, rowNo + 1):
    val += str(counter)
  val += " " * (totalRows - rowNo) * 2
  for counter in range(rowNo, 0, -1):
    val += str(counter)
  return val

for row in range(1, noOfRows + 1):
  print(prepareRowData(row, noOfRows))
