from tkinter import *
root=Tk()
root.title('简单界面')

w=Label(root,text="用户名",font=25)

w.pack(side=TOP, fill=BOTH,pady=30)
o=Label(root,text="密码",font=25)
o.pack(side=TOP, fill=BOTH)
v=Button(root,text="确定",background = 'yellow')
v.pack(side=LEFT,fill=BOTH,pady=50,padx=50)
a=Button(root,text="取消",background = 'red')
a.pack(side=RIGHT,fill=BOTH,pady=50,padx=50)

root.mainloop()
