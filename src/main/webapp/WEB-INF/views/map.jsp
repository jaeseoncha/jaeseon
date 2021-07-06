<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>종각역 지도로 보기</title>
</head>
<body>
<div id="map" style="width:1850px;height:850px;"></div>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=0b464bd1a1b138cbb522d292c53f2214"></script>
	<script>
		var container = document.getElementById('map');
		var options = {
			center: new kakao.maps.LatLng(37.57024400978662, 126.98300387799503),
			level: 3
		};

		var map = new kakao.maps.Map(container, options);
		// 마커가 표시될 위치입니다 
		var markerPosition  = new kakao.maps.LatLng(37.569631737697726, 126.98218848643019); 

		// 마커를 생성합니다
		var marker = new kakao.maps.Marker({
		    position: markerPosition
		});

		// 마커가 지도 위에 표시되도록 설정합니다
		marker.setMap(map);
		
	</script>


</body>
</html>