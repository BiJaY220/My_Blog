<nav class="navbar navbar-expand-lg navbar-dark colors">
  <a class="navbar-brand" href="Home.jsp">My Blog</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="Home.jsp">Home <span class="sr-only">(current)</span></a>
      </li>

      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Categories
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Hobbies</a>
          <a class="dropdown-item" href="#">Work</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">About Java</a>
        </div>
      </li>
          <li class="nav-item">
                <a class="nav-link" href="#"> <span class="	fa fa-address-card-o"></span> Contact</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Login.jsp"> <span class="fa fa-user-circle "></span> Login</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Register.jsp"> <span class="fa fa-user-plus "></span> Sign up</a>
            </li>
      
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>