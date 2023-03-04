<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <title>MEDIVISIT</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">

  <!-- Favicon -->
  <link href="../assets/Doctor/img/flavicon.png" rel="icon">

  <!-- Google Web Fonts -->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap" rel="stylesheet">

  <!-- Icon Font Stylesheet -->
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

  <!-- Libraries Stylesheet -->
  <link href="../assets/Doctor/lib/owlcarousel/../assets/Doctor/owl.carousel.min.css" rel="stylesheet">
  <link href="../assets/Doctor/lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

  <!-- Customized Bootstrap Stylesheet -->
  <link href="../assets/Doctor/css/bootstrap.min.css" rel="stylesheet">

  <!-- Template Stylesheet -->
  <link href="../assets/Doctor/css/style.css" rel="stylesheet">
</head>

<body>
  <div class="container-xxl position-relative bg-white d-flex p-0">
    <!-- Spinner Start -->
    <div id="spinner"
      class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
      <div class="spinner-border text-primary" style="width: 3rem; height: 3rem;" role="status">
        <span class="sr-only">Loading...</span>
      </div>
    </div>
    <!-- Spinner End -->


    <!-- Sidebar Start -->
    <div class="sidebar pe-4 pb-3">
      <nav class="navbar bg-light navbar-light">

        <a href="index.jsp" class="navbar-brand mx-4 mb-3">
          <h3 class="text-primary"><img src="../assets/Doctor/img/3.png" alt="" style="height: 60px;">MEDIVISIT</h3>
        </a>
        <div class="d-flex align-items-center ms-4 mb-4">
          <div class="position-relative">
            <img class="rounded-circle" src="../assets/Doctor/img/testimonial-1.jpg" alt="" style="width: 40px; height: 40px;">
            <div class="bg-success rounded-circle border border-2 border-white position-absolute end-0 bottom-0 p-1">
            </div>
          </div>
          <div class="ms-3">
            <h6 class="mb-0">Fatima FRIST</h6>
            <span>DOCTOR</span>
          </div>
        </div>

        <div class="navbar-nav w-100">
          <a href="index.html" class="nav-item nav-link "><i class="fa fa-tachometer-alt me-2"></i>Dashboard</a>

          <a href="appointment.jsp" class="nav-item nav-link "><i class="fa fa-medkit  me-2"></i>Appointments</a>
          <a href="patients.jsp" class="nav-item nav-link"><i class="fa fa-user-plus me-2"
              aria-hidden="true"></i>Patients</a>
          <a href="messages.jsp" class="nav-item nav-link"><i class="fa fa-envelope me-2"
              aria-hidden="true"></i>Messages</a>
          <a href="profil.jsp" class="nav-item nav-link active"><i class="fa fa-user-md me-2"
              aria-hidden="true"></i>Profil</a>


        </div>
      </nav>
    </div>
    <!-- Sidebar End -->


    <!-- Content Start -->
    <div class="content">
      <!-- Navbar Start -->
      <nav class="navbar navbar-expand bg-light navbar-light sticky-top px-4 py-0">
        <a href="index.jsp" class="navbar-brand d-flex d-lg-none me-4">
          <h2 class="text-primary mb-0"><img src="../assets/Doctor/img/flavicon.png" alt="" style="height: 30px;"></h2>
      </a>
        <a href="#" class="sidebar-toggler flex-shrink-0">
          <i class="fa fa-bars"></i>
        </a>

        <div class="navbar-nav align-items-center ms-auto">
          <div class="nav-item dropdown">
            <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
              <i class="fa fa-envelope me-lg-2"></i>
              <span class="d-none d-lg-inline-flex">Message</span>
            </a>
            <div class="dropdown-menu dropdown-menu-end bg-light border-0 rounded-0 rounded-bottom m-0">
              <a href="#" class="dropdown-item">
                <div class="d-flex align-items-center">
                  <img class="rounded-circle" src="../assets/Doctor/img/user.jpg" alt="" style="width: 40px; height: 40px;">
                  <div class="ms-2">
                    <h6 class="fw-normal mb-0">Jhon send you a message</h6>
                    <small>15 minutes ago</small>
                  </div>
                </div>
              </a>
              <hr class="dropdown-divider">
              <a href="#" class="dropdown-item">
                <div class="d-flex align-items-center">
                  <img class="rounded-circle" src="../assets/Doctor/img/user.jpg" alt="" style="width: 40px; height: 40px;">
                  <div class="ms-2">
                    <h6 class="fw-normal mb-0">Jhon send you a message</h6>
                    <small>15 minutes ago</small>
                  </div>
                </div>
              </a>
              <hr class="dropdown-divider">
              <a href="#" class="dropdown-item">
                <div class="d-flex align-items-center">
                  <img class="rounded-circle" src="../assets/Doctor/img/user.jpg" alt="" style="width: 40px; height: 40px;">
                  <div class="ms-2">
                    <h6 class="fw-normal mb-0">Jhon send you a message</h6>
                    <small>15 minutes ago</small>
                  </div>
                </div>
              </a>
              <hr class="dropdown-divider">
              <a href="#" class="dropdown-item text-center">See all message</a>
            </div>
          </div>
          <div class="nav-item dropdown">
            <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
              <i class="fa fa-bell me-lg-2"></i>
              <span class="d-none d-lg-inline-flex">Appointments</span>
            </a>
            <div class="dropdown-menu dropdown-menu-end bg-light border-0 rounded-0 rounded-bottom m-0">
              <a href="#" class="dropdown-item">
                <h6 class="fw-normal mb-0">Profile updated</h6>
                <small>15 minutes ago</small>
              </a>
              <hr class="dropdown-divider">
              <a href="#" class="dropdown-item">
                <h6 class="fw-normal mb-0">New user added</h6>
                <small>15 minutes ago</small>
              </a>
              <hr class="dropdown-divider">
              <a href="#" class="dropdown-item">
                <h6 class="fw-normal mb-0">Password changed</h6>
                <small>15 minutes ago</small>
              </a>
              <hr class="dropdown-divider">
              <a href="#" class="dropdown-item text-center">See all notifications</a>
            </div>
          </div>
          <div class="nav-item dropdown">
            <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
              <img class="rounded-circle me-lg-2" src="../assets/Doctor/img/testimonial-1.jpg" alt=""
                style="width: 40px; height: 40px;">
              <span class="d-none d-lg-inline-flex">Fatima FRIST</span>
            </a>
            <div class="dropdown-menu dropdown-menu-end bg-light border-0 rounded-0 rounded-bottom m-0">
              <a href="#" class="dropdown-item">My Profile</a>
              <a href="#" class="dropdown-item">Settings</a>
              <a href="#" class="dropdown-item">Log Out</a>
            </div>
          </div>
        </div>
      </nav>
      <!-- Navbar End -->


      <!-- Table Start -->

      <div class="container">
        <div class="row" style="margin-top: 30px; height: auto;">
          <div class="col-lg-12">
            <div class="card mb-4">
              <div class="card-body text-center">
                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-chat/ava3.webp" alt="avatar"
                  class="rounded-circle img-fluid" style="width: 150px;">
                <h5 class="my-3" name="dctname">John Smith</h5>
                <p class="text-muted mb-1">Doctor</p>
                <p class="text-muted mb-4" name="specialty">Cardiology</p>

              </div>

              <div class="col-lg-8" style="margin-left:190px;">
                <div class="card mb-4" style="border: 100px;">
                  <div class="card-body text-center">
                    <div class="row">
                      <div class="col-sm-3">
                        <p class="mb-0">Full Name</p>
                      </div>
                      <div class="col-sm-9">
                        <p class="text-muted mb-0" name="dctname">Johnatan Smith</p>
                      </div>
                    </div>
                    <hr>
                    <div class="row">
                      <div class="col-sm-3">
                        <p class="mb-0" >Email</p>
                      </div>
                      <div class="col-sm-9">
                        <p class="text-muted mb-0" name="email">example@example.com</p>
                      </div>
                    </div>
                    <hr>
                    <div class="row">
                      <div class="col-sm-3">
                        <p class="mb-0" >Phone</p>
                      </div>
                      <div class="col-sm-9">
                        <p class="text-muted mb-0" name="phone">(097) 234-5678</p>
                      </div>
                    </div>
                    <hr>
                    <div class="row">
                      <div class="col-sm-3">
                        <p class="mb-0" >Mobile</p>
                      </div>
                      <div class="col-sm-9">
                        <p class="text-muted mb-0" name="mobile">(098) 765-4321</p>
                      </div>
                    </div>
                    <hr>
                    <div class="row">
                      <div class="col-sm-3">
                        <p class="mb-0">Address</p>
                      </div>
                      <div class="col-sm-9">
                        <p class="text-muted mb-0" name="address">Bay Area, San Francisco, CA</p>
                      </div>
                    </div>
                    <hr>
                    <div class="row">
                      <div class="col-sm-3">
                        <p class="mb-0">Password</p>
                      </div>
                      <div class="col-sm-9">
                        <p class="text-muted mb-0" name="pass">**************</p>
                      </div>
                    </div>
                    <hr>
                    <div class="row">
                      <div class="col-sm-3">
                        <p class="mb-0">New Password</p>
                      </div>
                      <div class="col-sm-9">
                        <p class="text-muted mb-0" name="newpass">**************</p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div class="d-flex justify-content-center mb-2">
                <button type="button" class="btn btn-primary" name="Edit">Edit Profil</button>
                <button type="button" class="btn btn-outline-primary ms-1" name="Logout">Logout</button>
              </div>
            </div>


          </div>


        </div>
      </div>
      <!-- Table End -->


      <!-- Footer Start -->
      <div class="container-fluid pt-4 px-4">
        <div class="bg-light rounded-top p-4">
          <div class="row">
            <div class="col-12 col-sm-6 text-center text-sm-start">
              &copy; <a href="#">MEDIVISIT</a>, All Right Reserved.
            </div>

          </div>
        </div>
      </div>
      <!-- Footer End -->
    </div>
    <!-- Content End -->


    <!-- Back to Top -->
    <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="bi bi-arrow-up"></i></a>
  </div>

  <!-- JavaScript Libraries -->
  <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
  <script src="../assets/Doctor/lib/chart/chart.min.js"></script>
  <script src="../assets/Doctor/lib/easing/easing.min.js"></script>
  <script src="../assets/Doctor/lib/waypoints/waypoints.min.js"></script>
  <script src="../assets/Doctor/lib/owlcarousel/owl.carousel.min.js"></script>
  <script src="../assets/Doctor/lib/tempusdominus/js/moment.min.js"></script>
  <script src="../assets/Doctor/lib/tempusdominus/js/moment-timezone.min.js"></script>
  <script src="../assets/Doctor/lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

  <!-- Template Javascript -->
  <script src="../assets/Doctor/js/main.js"></script>
</body>

</html>