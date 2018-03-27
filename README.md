# EventBus
EVENT BUS SIMPLE EXAMPLE

Introduction:
---------------

Event Bus is a simple library which helps to share data between Activities and Fragments .
Easy to USe and reduce the huge line of code .
(ie;)
We can say that it is a replacement of using intent to send the code 

Steps To Use Event Bus:
------------------------

a.) Open the Gradle of Your Application and add the following dependency and rebulid your application.

              compile 'org.greenrobot:eventbus:3.1.1'
 
b.)From the class whereyou want to send the data creata an object of Eventbus:
 
                EventBus.getDefault().postSticky(new MsgEvent("XXXXXXXX1#1#1#1#1T..!"));

c.)MsgEvent is a simple plain Old java class with a simple function to getMessge().

d.)Now we have to register the event in the Activity which recieves the event and unregister once it has finished.
   Create a function with anotation @Subscribe

 EventBus eventBus =  EventBus.getDefault();
  eventBus.register(this); //register The event


 @Subscribe(sticky = true) // You can see the doc for other parameters you can pass.
    public void onEvent(MsgEvent event){
        tv = (TextView)findViewById(R.id.tv);
        tv.setText("event::"+event.getMsg());
        Toast t = Toast.makeText(this,event.getMsg(),Toast.LENGTH_LONG);
        t.show();
    }


eventBus.unregister(this); //Un register once finished
              
