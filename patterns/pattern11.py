# 1
# 0 1
# 1 0 1
# 0 1 0 1
# 1 0 1 0 1

iNum = int(input("Enter a number: "))
obj = { 0: 1, 1: 0 }
val = ""
num = 0

for i in range(iNum):
  num = obj[num]
  val = str(num) + " " + val
  print(val)
