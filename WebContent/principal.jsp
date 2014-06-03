<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ include file="includes/config.php" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Juegos JEE</title>

<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/carousel.css" rel="stylesheet">
<link rel="stylesheet" href="css/bootstrap-social.css">
<link rel="stylesheet" href="css/font-awesome.css">
</head>
<body>

<%@ include file="includes/header.php" %>
    <!-- Carousel
    ================================================== -->
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner">
        <div class="item active">
          <img src="img/carrousel1.jpg" alt="First slide">
          <div class="container">
            <div class="carousel-caption">

            </div>
          </div>
        </div>
        <div class="item">
          <img src="img/Slider.png" alt="Second slide">
          <div class="container">
            <div class="carousel-caption">
                            <p><a href="" class="btn btn-primary" title="">Apartar &raquo;</a></p>
            </div>
          </div>
        </div>
        <div class="item">
          <img src="img/Slider3.png" alt="Third slide">
          <div class="container">
            <div class="carousel-caption">
                            <p><a href="" class="btn btn-primary" title="">Apartar &raquo;</a></p>
            </div>
          </div>
        </div>
      </div>
      <a class="left carousel-control" href="#myCarousel" data-slide="prev"><span id="left" class="glyphicon glyphicon-chevron-left"></span></a>
      <a class="right carousel-control" href="#myCarousel" data-slide="next"><span id="right" class="glyphicon glyphicon-chevron-right"></span></a>
    </div><!-- /.carousel -->



    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

    <div class="container marketing">

      <!-- Three columns of text below the carousel -->
      <div class="row">
        <div class="col-lg-3 col-sm-12">
          <img class="img-rounded" src="img/halo5.jpg" alt="Generic placeholder image">
          <h2>Halo 5</h2>
          <p class="text">Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>
          <p class="tags">
            <a href="juegos.php"><span class="label label-success">Xbox360</span></a>
            
          </p>
          <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
        </div><!-- /.col-lg-3 -->
        <div class="col-lg-3 col-sm-12">
          <img class="img-rounded" src="img/masseffect.jpg" alt="Generic placeholder image">
          <h2>Masseffect</h2>
          <p class="text">Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh.</p>
          <p class="tags">
            <a href="juegos.php"><span class="label label-success">Xbox360</span></a>
            <span class="label label-info">Play Station 3</span>
          </p>
          <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
        </div><!-- /.col-lg-3 -->
        <div class="col-lg-3 col-sm-12">
          <img class="img-rounded" src="img/re.jpg" alt="Generic placeholder image">
          <h2>Resident Evil</h2>
          <p class="text">Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
          <p class="tags">
            <a href="juegos.php"><span class="label label-success">Xbox360</span></a>
            <span class="label label-info">Play Station 3</span>
          </p>
          <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-3 col-sm-12">
          <img class="img-rounded" src="img/halo5.jpg" alt="Generic placeholder image">
          <h2>Halo 5</h2>
          <p class="text">Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>
          <p class="tags">
            <span class="label label-danger">Nintendo</span>
            
          </p>
          <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
        </div><!-- /.col-lg-3 -->
      </div><!-- /.row -->

      <!-- /END THE FEATURETTES -->
      <%@ include file="includes/footer.php" %>

</body>
</html>