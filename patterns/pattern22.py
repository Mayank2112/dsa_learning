# 4 4 4 4 4 4 4
# 4 3 3 3 3 3 4
# 4 3 2 2 2 3 4
# 4 3 2 1 2 3 4
# 4 3 2 2 2 3 4
# 4 3 3 3 3 3 4
# 4 4 4 4 4 4 4

num = int(input("Enter a number: "))

for i in range(num - 1):
  curr = num - i
  forward = ""
  backward = ""
  for j in range(num, curr, -1):
    forward += str(j) + " "
    backward = str(j) + " " + backward
  print(forward + ((str(curr) + " ") * ((2 * curr) - 1)) + backward)

for i in range(num - 1, -1, -1):
  curr = num - i
  forward = ""
  backward = ""
  for j in range(num, curr, -1):
    forward += str(j) + " "
    backward = str(j) + " " + backward
  print(forward + ((str(curr) + " ") * ((2 * curr) - 1)) + backward)
