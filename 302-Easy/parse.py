import csv
reader = csv.reader(open("elements.txt"), delimiter="\t")

for row in reader:
    print("\"" + row[1] + "\" -> (" + row[0] + "," + row[3].strip("()") + "),")
