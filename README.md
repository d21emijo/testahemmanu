# testahemmanu
ytvids


    ![image](https://user-images.githubusercontent.com/102797583/164236711-c3ef9b8c-4f11-4e19-93ef-bca057101a08.png)


1. gjort en constraint "låda" med 3 olika knappar

    ![image](https://user-images.githubusercontent.com/102797583/164216319-55c64311-34b1-4b30-a825-fe6badaadec3.png)

2. den översta knappen(toggletext) tar fram den dolda textvy'n med id't hellotext där en knapp defineras mha 
    
    /// Button textknapp = findViewById(R.id.toggletext); ///
    
    där java sätter en ny "textknapp" för id toggletext. därefter skapas en metod med "setOnClickListener" i vilket vi definerar en   
    
    ///  TextView hellotext = findViewById(R.id.helloText); /// 
    
    därefter /// hellotext.setVisibility(View.VISIBLE); /// i vilket hellotext sätts som Visible.
    
    ![image](https://user-images.githubusercontent.com/102797583/164239212-9d70fe5a-8299-4480-b5d4-97c5222681e6.png)

    går att använda onClick för att skapa metoder.
    
    ![image](https://user-images.githubusercontent.com/102797583/164239410-8e9648a5-6618-42b1-8fde-1f373d0cb524.png)

    här för att göra så att båda knapparna har samma funktion, dvs båda knapparna disablar sin egen knapp på "onClick"
    
    
3.    
    ![image](https://user-images.githubusercontent.com/102797583/164695491-772de06e-e074-40d3-b6a3-c970d72d9214.png)
    
    knappen stänga av hämtar inputen från firstname och skriver ut i Logcat.
    
    ![image](https://user-images.githubusercontent.com/102797583/164696582-f9528783-95de-4d70-892a-bdebd8cc5e7b.png)
    
    hämtar först id och "castar" det till en variabel här "firstName"
    
    därefter fixar jag en knapp som får variabeln "logindetail"
    kontrollerar när knappen klickas med        "logindetail.setOnClickListener(new View.OnClickListener()"     och loggar först ett knapp tryck, därefter vill jag ha     en String med förnamet, för att skapa det används en ny variabel "loginfirstname" som är samma som "firstName"  mha     
        "String loginfirstname = firstName.getText().toString();"
        
        
        " firstNameedt.setText(loginfirstname);  " 
        sätter firstname variabeln till den input från loginfirstname här
        
        

      alerts!
        
        ![image](https://user-images.githubusercontent.com/102797583/165261722-7a1ed548-c728-441a-96b7-05eacb0a2206.png)
        
        ## Toast.makeText(MainActivity.this, "du heter alltså " + loginfirstname, Toast.LENGTH_SHORT).show();  ##
        
        mainactivitity.this där this bestämmer i vilken aktivity vi är i.

        
      ##new actiyvity
        1.
        ![image](https://user-images.githubusercontent.com/102797583/165269548-96f935a7-bb68-4f24-8e22-ba0e36b3b76c.png)
        2. 

        ![image](https://user-images.githubusercontent.com/102797583/165269943-44e3a251-2a67-46a1-8f88-05da7613fd61.png)
        
        ![image](https://user-images.githubusercontent.com/102797583/165272430-e6696242-77cd-4796-9bae-5120d0624507.png)
        
        ![image](https://user-images.githubusercontent.com/102797583/165272585-0f42a927-9173-4497-aa52-b7c7dcc69890.png)
        
        
        använder buttons onclick för att komma till ny sida, skapar ny intent och därefter startar den
        
       



       

