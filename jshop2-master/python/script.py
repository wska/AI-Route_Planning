ROVERS = [0,1,2]

map_str = "1 6 2 7 3 8 4 9 7 12 8 13 9 14 12 17 13 18 16 21 17 22 18 23 4 5 6 7 9 10 11 12 12 13 13 14 14 15 16 17 17 18 18 19 19 20"
map = map_str.split()

map_2 = [(map[i],map[i+1]) for i in range(len(map)//2)]

print(map_2)


for r in ROVERS:
    print("(AT ROVER" + str(r) + " WAYPOINT"+str((r+1))+")")
    print("(AVAILABLE ROVER"+str(r)+ ")")
    for entry in map_2:
      print("(CAN_TRAVERSE ROVER" + str(r) + " WAYPOINT" + entry[0] + " WAYPOINT" + entry[1]+")")
