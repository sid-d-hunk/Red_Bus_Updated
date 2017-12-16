<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Red_Bus</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    var availableTags = [
      "Bangalore",
      "Bhubaneswar",
      "Bhadrakh",
      "Jagatsinghpur",
      "Jharsugura",
      "Cuttack",
      "Kolkatta",
      "Hydrabad",
      "Chennai",
      "Coimbatore",
      "Madurai",
      "Mumbai",
      "Delhi",
      "Varodara",
      "Ahmedabad",
      "Udupi",
      "Chandigarh",
      "Trivendrum",
      "Tirupati",
      "Sambalpur",
      "Raipur",
      "Puri"
    ];
    $( "#tags" ).autocomplete({
      source: availableTags
    });
  } );
  $( function() {
	    $( "#datepicker" ).datepicker({ minDate: 0 });
	  } );
  </script>
 
   <script>
  $( function() {
    var availableTags1 = [
      "Bangalore",
      "Bhubaneswar",
      "Bhadrakh",
      "Jagatsinghpur",
      "Jharsugura",
      "Cuttack",
      "Kolkatta",
      "Hydrabad",
      "Chennai",
      "Coimbatore",
      "Madurai",
      "Mumbai",
      "Delhi",
      "Varodara",
      "Ahmedabad",
      "Udupi",
      "Chandigarh",
      "Trivendrum",
      "Tirupati",
      "Sambalpur",
      "Raipur",
      "Jaipur"
    ];
    $( "#tags1" ).autocomplete({
      source: availableTags1 
    });
  } );
  $( function() {
	    $( "#datepicker1" ).datepicker({ minDate: 0 });
	  } );
  </script>
  <style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}
th
{
border: 1px solid #ffffff;
 padding: 8px;
}
tr {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
    background-color: #ebedfd;
    
}
td:nth-child(odd) {
    background-color: #8c8282;
    border: 1px solid #ffffff;
    padding: 8px;
}
.button {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
</style>
  
  
</head>
<body style="background-color:#9e0d0d;">
<form action="addBusRedirect.jsp" class="inline">
<table>
  <tr>
    <th>Red Bus Data - Add New BUS</th>

  </tr>
  <tr>
    <td>City From </td>
    <td> <input id="tags" name="fromCity"> </td>
    <td>Date From </td>
    <td><input type="text" id="datepicker" name="fromDate"></td>
  </tr>
  <tr>
    <td>City To </td>
    <td> <input id="tags1" name="toCity"> </td>
    <td>Date To </td>
    <td><input type="text" id="datepicker1" name="toDate"></td>
  </tr>
   <tr>
    <td>Bus Name </td>
    <td><input id="busName" name="busName"></td>
    <td>Bus No </td>
    <td><input id="busNo" name="busNo"></td>
  </tr>
   <tr>
    <td>Bus Manager </td>
    <td><input id="busManager" name="busManager"></td>
    <td>Contact No </td>
    <td><input id="contactNumber" name="contactNumber"></td>
  </tr>
   <tr>
    <td>AC Available </td>
    <td><input type="checkbox" name="isAc" value="true"></td>
    <td>Volvo </td>
    <td><input type="checkbox" name="isVolvo" value="true"></td>
  </tr>
  <tr>
    <td>Food Available </td>
    <td><input type="checkbox" name="isFood" value="true"></td>
    <td>Separate Ladies Seat </td>
    <td><input type="checkbox" name="isSeparetladiesseat" value="true"></td>
  </tr>
   <tr>
    <td>SMS Alert </td>
    <td><input type="checkbox" name="smsAlert" value="true"></td>
    <td></td>
    <td></td>
  </tr>
  
  

  </table>


<div>

<button class="button">Add Bus</button>

</div>
    
</form>
 
</body>
</html>