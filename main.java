Do{

  Print_welcome_page;
  
  btnStart{
  
    If(btnOk==1){
      
      Open_Activity3{
        
        call_class_travel;
        call_class_music;
        call_class_food;
      }
    }
    
    else{
      
      Open_Activity2
    }
  }
  
  btnNew{
  
    Erase_data;
    Print TAG;
  }
  
}while(exit=!0);  
 
