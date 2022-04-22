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
      
        
    

