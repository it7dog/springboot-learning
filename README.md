@MapperScan可以指定要扫描的Mapper类的包的路径  
  @MapperScan("com.springboot.learning.restful.springbootrestful.dao")  
  
@RequestMapping 处理请求地址映射。  
> method - 指定请求的方法类型：POST/GET/DELETE/PUT 等
   value - 指定实际的请求地址
   consumes - 指定处理请求的提交内容类型，例如 Content-Type 头部设置application/json, text/html
   produces - 指定返回的内容类型
   
   
* @PathVariable URL 映射时，用于绑定请求参数到方法参数  
* @RequestBody 这里注解用于读取请求体 boy 的数据，通过 HttpMessageConverter 解析绑定到对象中  


HTTP 知识补充  
> GET            请求获取Request-URI所标识的资源  

> POST          在Request-URI所标识的资源后附加新的数据  
  HEAD         请求获取由Request-URI所标识的资源的响应消息报头  
  PUT            请求服务器存储一个资源，并用Request-URI作为其标识  
  DELETE       请求服务器删除Request-URI所标识的资源  
  TRACE        请求服务器回送收到的请求信息，主要用于测试或诊断  
  CONNECT  保留将来使用  
  OPTIONS   请求查询服务器的性能，或者查询与资源相关的选项和需求  # springboot-learning


@PathVariable和@RequestParam，分别是从路径里面去获取变量，也就是把路径当做变量，后者是从请求里面获取参数。   


首先 上两个地址：

地址①
http://localhost:8989/SSSP/emps?pageNo=2

地址②
http://localhost:8989/SSSP/emp/7


如果想获取地址①中的 pageNo的值 ‘2’ ，则使用  @RequestParam ，

如果想获取地址②中的 emp/7 中的 ‘7 ’   则使用 @PathVariable 