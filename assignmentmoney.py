#โปรแกรมแลกธนบัตร

money=int(input("ป้อนค่าธนบัตรของคุณ : "))

if money>=1000:
    print("1000 บาท :",money//1000,"ใบ")
    money%=1000
if money>=500:
    print("500 บาท :",money//500,"ใบ")
    money%=500
if money>=100:
    print("100 บาท :",money//100,"ใบ")
    money%=100
if money>=50:
    print("50 บาท :",money//50,"ใบ")
    money%=50
if money>=20:
    print("20 บาท :",money //20,"ใบ")
    money%=20
if money>=10:
    print("10 บาท",money//10,"เหรียญ")
    money%=10
    print("เศษ = ",money,"เหรียญ")