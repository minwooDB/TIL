<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 테스트</title>
<style>
table, td, th {
	border : 1px solid black;
}
</style>
</head>
<body>
<h2>위치정보</h2>
<hr>
<c:catch var="err">   
  <c:import var="location" 
 url="https://maps.googleapis.com/maps/api/geocode/xml?language=ko&key=AIzaSyCymy5ucS__gaVvSVE_udW4SSO2fLn8MnE" charEncoding="">
  	<c:param name = "address" value = "신내동"/>
  </c:import>
  <x:parse varDom="wrss" xml="${location}"></x:parse>
  <x:out select="$wrss/GeocodeResponse/result/title"></x:out><br/>   
  <table>
     
         <td>주소</td>
         <td>
               <x:out select="$wrss/GeocodeResponse/result/formatted_address"/> 
               <x:out select="$wrss/GeocodeResponse/result/address_component[5]/long_name"/>
         </td>
     </tr>   
     <tr>
         <td>위도 </td>
         <td>
               <x:out select="$wrss/GeocodeResponse/result/geometry/viewport/southwest/lat"/> 
        </td>
     </tr>   
     <tr>
         <td>경도 </td>
         <td> 
              <x:out select="$wrss/GeocodeResponse/result/geometry/viewport/southwest/lng"/> 
         </td>
     </tr>   
  </table>
</c:catch>
<c:if test="${!empty err}">
   <h2>오류가 발생했어요....</h2>
   ${err}
</c:if> 
</body>
</html>