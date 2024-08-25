#         *
#       * * *
#     * * * * *
#   * * * * * * *
# * * * * * * * * *
# * * * * * * * * *
#   * * * * * * *
#     * * * * *
#       * * *
#         *

noOfRows = int(input("Enter number of rows: "))

for row in range(1, noOfRows + 1):
  count = 2 * row - 1
  spaceCount = (noOfRows - row) * 2
  print(" " * spaceCount, "* " * count)

for row in range(noOfRows, 0, -1):
  count = 2 * row - 1
  spaceCount = (noOfRows - row) * 2
  print(" " * spaceCount, "* " * count)
