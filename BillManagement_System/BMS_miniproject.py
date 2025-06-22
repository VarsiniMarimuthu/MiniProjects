from tkinter import *

root=Tk()
root.geometry("1000x1000")
root.title("Bill Mangement")
root.resizable (False, False)

def Reset():
    Entry_Dosa.delete(0,END)
    Entry_Cookies.delete(0,END)
    Entry_Tea.delete(0,END)
    Entry_Coffee.delete(0,END)
    Entry_Juice.delete(0,END)
    Entry_Pancakes.delete(0,END)
    Entry_Eggs.delete(0,END)

def Total():
    try:a1=int(Dosa.get())
    except:a1=0
    

    try:a2=int(Cookies.get())
    except:a2=0

    try:a3=int(Tea.get())
    except:a3=0

    try:a4=int(Coffee.get())
    except:a4=0

    try:a5=int(Juice.get())
    except:a5=0

    try:a6=int(Pancakes.get())
    except:a6=0

    try:a7=int(Eggs.get())
    except:a7=0

    c1=60*a1
    c2=30*a2
    c3=7*a3
    c4=100*a4
    c5=20*a5
    c6=15*a6
    c7=7*a7

    lb1_total=Label(f2,font=('aria',20,'bold'),text="Total",width=16,fg="lightyellow",bg="black")
    lb1_total.place(x=10,y=80)

    entry_Total=Entry(f2,font=('aria',20,'bold'),textvariable=Total_bill,bd=6,width=15,bg="lightgreen")
    entry_Total.place(x=60,y=130)

    totalcost=c1+c2+c3+c4+c5+c6+c7
    string_bill="Rs.",str('%.2f'%totalcost)
    Total_bill.set(string_bill)
    
def paydetails():

    n=Toplevel(root)
    n.title("PAYMENT PROCESS")
    a=Label(n,text="PAYMENT PROCESS",bg="black", fg="white", font=("calibri",33), width="300",height="2").pack()
    b=Label(n,text="NAME").place(x=160,y=200)
    b1=Entry(n).place(x=280,y=200)
    c=Label(n,text="MOBILE NO").place(x=160,y=240)
    c1=Entry(n).place(x=280,y=240)
    d=Label(n,text="PAYMENT MODE").place(x=160,y=280)
    r1=Radiobutton(n,text="Online",value=1).place(x=280,y=300)
    r2=Radiobutton(n,text="Offline",value=2).place(x=280,y=320)
    e=Label(n,text="PAYMENT MODE").place(x=160,y=360)
    menu=StringVar()
    menu.set("select a payment method")
    payment=OptionMenu(n,menu,"UPI","Phone pay","Gpay","creditcard","debitcard","Net banking","Paytm")
    payment.place(x=280,y=380)
    f=Button(n,text="Proceed to pay",command=pay).place(x=450,y=450)
def pay():
    n=Toplevel(root)
    n.title("PROCEED TO PAY")
    a=Label(n,text="PROCEED TO PAY",bg="black", fg="white",font=("calibri",33), width="300",height="2").pack()
    l1=Label(n,text="ENTER YOUR UPI ID").place(x=160,y=200)
    l2=Entry(n).place(x=280,y=200)
    l3=Label(n,text="ACCOUNT NUMBER").place(x=160,y=240)
    l4=Entry(n).place(x=280,y=240)
    l5=Label(n,text="ENTER YOUR OTP").place(x=160,y=280)
    l6=Entry(n).place(x=280,y=280)
    b1=Button (n,text="VERIFY").place(x=450,y=450)
    b2=Button (n,text="SUBMIT",command=end).place(x=400,y=500)
    b3=Button (n,text="CANCEL").place(x=500,y=500)
def end():
    n=Toplevel(root)
    n.title("DONE")
    f=Label(n,text="BILLING DONE SUCCESSFULLY", bg="black", fg="white", font=("calibri",33), width="300",height="10").pack()
    
    
    
Label (text="RAINBOW CAFE", bg="black", fg="white", font=("calibri",33), width="300",height="2").pack()

#MENU CARD
f=Frame (root, bg="lightgreen", highlightbackground="black", highlightthickness=1,width=300,height=370)
f.place(x=0,y=118)
Label(f, text="Menu", font=("Gabriola", 40, "bold"), fg="black", bg="lightgreen"). place (x=80,y=0)
Label(f, font=("Lucida Calligraphy", 15, 'bold'), text="Dosa.......Rs.60/1", fg="black", bg="lightgreen"). place (x=10,y=80)
Label (f, font=("Lucida Calligraphy", 15, 'bold'), text="Cookies....Rs.30/1",fg="black", bg="lightgreen"). place (x=10,y=110)
Label (f, font=("Lucida Calligraphy", 15, 'bold'), text="Tea........Rs.7/1", fg="black", bg="lightgreen"). place (x=10,y=140)
Label (f, font=("Lucida Calligraphy", 15, 'bold'), text="Coffee.....Rs.100/1", fg="black", bg="lightgreen"). place (x=10,y=170)
Label(f, font=("Lucida Calligraphy", 15, 'bold'), text="Juice......Rs.20/1", fg="black", bg="lightgreen"). place (x=10,y=200)
Label (f, font=("Lucida Calligraphy", 15, 'bold'), text="Pancakes...Rs.15/1", fg="black", bg="lightgreen"). place (x=10,y=230)
Label(f, font=("Lucida Calligraphy", 15, 'bold'), text="Eggs.......Rs.7/1", fg="black", bg="lightgreen"). place (x=10,y=260)

#BILL
f2=Frame(root,bg="lightyellow",highlightbackground="black",highlightthickness=1,width=300,height=370)
f2.place(x=690,y=118)
Bill=Label(f2,text="Bill",font=('calibri',20),bg="lightyellow")
Bill.place(x=150,y=10)

#ENTRY WORK
f1=Frame (root, bd=5,height=370, width=300, relief=RAISED)
f1.pack()
Dosa=StringVar()
Cookies=StringVar()
Tea=StringVar()
Coffee=StringVar()
Juice=StringVar()
Pancakes=StringVar()
Eggs=StringVar()
Total_bill=StringVar()

#Label
lbl_Dosa=Label (f1, font=("aria", 20, 'bold'), text="Dosa", width=12, fg="blue4")
lbl_Cookies=Label (f1, font=("aria", 20, 'bold'), text="Cookies", width=12, fg="blue4")
lbl_Tea=Label (f1, font=("aria", 20, 'bold'), text="Tea", width=12, fg="blue4")
lbl_Coffee=Label (f1, font=("aria", 20, 'bold'), text="Coffee", width=12, fg="blue4")
lbl_Juice=Label (f1, font=("aria", 20, 'bold'), text="Juice", width=12, fg="blue4")
lbl_Pancakes=Label (f1, font=("aria", 20, 'bold'), text="Pancakes", width=12, fg="blue4")
lbl_Eggs=Label (f1, font=("aria", 20, 'bold'), text="Eggs", width=12, fg="blue4")
lbl_Dosa.grid(row=1, column=0)
lbl_Cookies.grid(row=2, column=0)
lbl_Tea.grid(row=3, column=0)
lbl_Coffee.grid(row=4, column=0)
lbl_Juice.grid(row=5, column=0)
lbl_Pancakes.grid(row=6, column=0)
lbl_Eggs.grid(row=7, column=0)

#Entry
Entry_Dosa=Entry (f1, font=("aria", 20, 'bold'), textvariable=Dosa, bd=6, width=8, bg="lightpink")
Entry_Cookies=Entry (f1, font=("aria", 20, 'bold'), textvariable=Cookies, bd=6, width=8, bg="lightpink")
Entry_Tea=Entry (f1, font=("aria", 20, 'bold'), textvariable=Tea, bd=6, width=8, bg="lightpink")
Entry_Coffee=Entry (f1, font=("aria", 20, 'bold'), textvariable=Coffee, bd=6, width=8, bg="lightpink")
Entry_Juice=Entry (f1, font=("aria", 20, 'bold'), textvariable=Juice, bd=6, width=8, bg="lightpink")
Entry_Pancakes=Entry (f1, font=("aria", 20, 'bold'), textvariable=Pancakes, bd=6, width=8, bg="lightpink")
Entry_Eggs=Entry (f1, font=("aria", 20, 'bold'), textvariable=Eggs, bd=6, width=8, bg="lightpink")
Entry_Dosa.grid(row=1, column=1)
Entry_Cookies.grid(row=2, column=1)
Entry_Tea.grid(row=3, column=1)
Entry_Coffee.grid(row=4, column=1)
Entry_Juice.grid(row=5, column=1)
Entry_Pancakes.grid(row=6, column=1)
Entry_Eggs.grid(row=7, column=1)

#buttons
btn_reset=Button (f1, bd=5, fg="black", bg="lightblue", font=("ariel", 16, 'bold'), width=10, text="Reset", command=Reset)
btn_reset.grid(row=8, column=0)
btn_total=Button (f1, bd=5, fg="black", bg="lightblue", font=("ariel", 16, 'bold'), width=10, text="Total", command=Total)
btn_total.grid(row=8, column=1)
btn_pay=Button (f1, bd=5, fg="black", bg="lightblue", font=("ariel", 16, 'bold'), width=10, text="Next", command=paydetails)
btn_pay.grid(row=8, column=2)

root.mainloop()




