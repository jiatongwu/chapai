const instance = axios.create();
// Add a request interceptor
instance.interceptors.request.use(function (config) {
    // Do something before request is sent
    config.headers['X-Requested-With']='XMLHttpRequest';
   // console.log(config);
    return config;
  }, function (error) {
    // Do something with request error
    console.log(error);
    return Promise.reject(error);
  });

// Add a response interceptor
instance.interceptors.response.use(function (response) {
  
    // Do something with response data
   //console.log(response);
    var code=response.data.code;
    
    if(code==3){
      console.log("code===",code);
     // layer.close(loginLoading);
     layer.msg("没有权限", {
        icon : 6
      });
      return null;
    }else if(code==2){
      layer.confirm('您已超时请重新登录？', function (index) {
        //(window.top === window.self) || (window.top.location.href = window.self.location.href);
        window.top.location.href=contextPath+"/loginPage.html";
      });
      return null;
    }
    return response;
  }, function (error) {
    // Do something with response error
    console.log(error);
    layer.msg("后台出错", {
      icon : 6
    });
    return null;
  });