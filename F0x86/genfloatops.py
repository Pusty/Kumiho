floatVarST = ["   D8 C0+i ;FASS ST0, STi",
"   D8 C8+i ;FMUL ST0, STi",
"   D8 D0+i ;FCOM STi",
"   D8 D8+i ;FCOMP STi",
"   D8 E0+i ;FSUB ST0, STi",
"   D8 E8+i ;FSUBR ST0, STi",
"   D8 F0+i ;FDIV ST0, STi",
"   D8 F8+i ;FDIVR ST0, STi",
"   D9 C0+i ;FLD STi",
"   D9 C8+i ;FXCH STi",
"   DA C0+i ;FCMOVB   ST0, STi",
"   DA C8+i ;FCMOVE   ST0, STi",
"   DA D0+i ;FCMOVBE  ST0, STi",
"   DA D8+i ;FCMOVU   ST0, STi",
"   DB C0+i ;FCMOVNB  ST0, STi",
"   DB C8+i ;FCMOVNE  ST0, STi",
"   DB D0+i ;FCMOVNBE ST0, STi",
"   DB D8+i ;FCMOVNU  ST0, STi",
"   DB E8+i ;FUCOMI   ST0, STi",
"   DB F0+i ;FCOMI    ST0, STi",
"   DC C0+i ;FADD STi, ST0",
"   DC C8+i ;FMUL STi, ST0",
"   DC E0+i ;FSUBR STi, ST0",
"   DC E8+i ;FSUB STi, ST0",
"   DC F0+i ;FDIVR STi, ST0",
"   DC F8+i ;FDIV STi, ST0",
"   DD C0+i ;FFREE STi",
"   DD D0+i ;FST STi",
"   DD D8+i ;FSTP STi",
"   DE C0+i ;FADDP STi, ST0",
"   DE C8+i ;FMULP STi, ST0",
"   DE E0+i ;FSUBRP STi, ST0",
"   DE E8+i ;FSUBP STi, ST0",
"   DE F0+i ;FDIVRP STi, ST0",
"   DE F8+i ;FDIVP STi, ST0",
"   DF E8+i ;FUCOMIP ST0, STi",
"   DF F0+i ;FCOMIP  ST0, STi"]

for st in floatVarST:
    before = st[:6]
    after  = st[10:]
    base = int(st.split(" ;")[0].split()[1][:-2],16)
    for i in range(8):
        print before+hex(base+i).upper()[2:]+after.replace("STi","ST"+str(i))
    
