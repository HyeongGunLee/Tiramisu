<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<style>
input[type="submit"].iogin {   
    /* float: left; */   
    cursor: pointer;   
    width: 250px;   
    height: 60px;   
    padding: 8px 6px;   
    margin-left: 20px;   
    background-color: #F2F2F2;   
    color: rgba(134, 79, 11, 0.8);   
    text-transform: uppercase;   
    font-weight: bold;   
    border: 2px solid #6D3D27;   
       
    -moz-border-radius: 5px;   
    -webkit-border-radius: 5px;   
    border-radius: 5px;   
       
    text-shadow: 0 1px 2px rgba(255, 255, 255, 0.7), 
                 0 -1px 0 rgba(64, 38, 5, 0.9);    
    -moz-box-shadow: inset 0 0 3px rgba(255, 255, 255, 0.6), 
                     inset 0 1px 2px rgba(255, 255, 255, 0.7), 
                     0 5px 0 #b8882a, 
                     0 6px 0 #593a11, 
                     0 13px 0 #ccc;   
    -webkit-box-shadow: inset 0 0 3px rgba(255, 255, 255, 0.6),
                        inset 0 1px 2px rgba(255, 255, 255, 0.7), 
                        0 5px 0 #b8882a, 
                        0 6px 0 #593a11, 
                        0 13px 0 #ccc;   
    box-shadow: inset 0 0 3px rgba(255, 255, 255, 0.6), 
                inset 0 1px 2px rgba(255, 255, 255, 0.7), 
                0 5px 0 #b8882a, 
                0 6px 0 #593a11, 
                0 13px 0 #ccc;   
  
    -webkit-transition: background 0.2s ease-out;   
}  
</style>

<!--header start here-->
<div class="header-main" style="height:110px">
    
    <div class="header-right" >
    <form action="loginAndSignup.jsp">
        <input type="submit" value="Login & Sign Up" class="iogin" style="font-size:18px; padding:0px 50px 0px 50px; position:absolute; top:20px; right:20px;">  
        </form>
    <div class="clearfix"></div>
    </div>
    <div class="clearfix"></div>
</div>
<!--heder end here-->

