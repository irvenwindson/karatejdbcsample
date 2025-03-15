function fn() {
  var DbUtils = Java.type('karate.DbUtils');
  var config = {
    apiUrl: 'http://localhost:8080/api/todos',
    apiToken: '',
    db: new DbUtils("jdbc:sqlserver://[yourserver];encrypt=true;databaseName=[yourdb];user=[youruser];password=[yourpassword];trustServerCertificate=true")
  };

  return config;
}