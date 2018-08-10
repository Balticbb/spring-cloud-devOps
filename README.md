`springcloud` `docker` `google-jib` `lvs` `keepalived` `openResty` `etcd` `consul` `flanneld`  

#1 项目简介
com.ms.springcloud是以springCloud(Finchley.SR1)为编码基础并结合google jib,docker,k8s,etcd,fanneld,lvs,keepalived,opneResty,consul打造出来的一套个人devOps解决方案
##1.1 springcloud组件
###1.1.1 springcloud-gateway
    gateway是基于webFlux的nio的不阻塞特性开发,使用者可以方便的切换到基于springMvc的zuul上
###1.1.2 springcloud-openfeign
    openfeign进一步封装ribbon,更易使用,项目中结合了Hystrix的服务降级功能以及ribbon的负载均衡功能
###1.1.3 springcloud-consul
    consul主要在项目中充当服务注册与发现,分布式配置的功能


#2 jib使用

##2.1打包镜像并上传到镜像仓库
    mvn clean compile jib:build
    
##2.2打包镜像并本地运行
    mvn clean comiple jib:dockerBuild
   
##2.3生成jar包与dockerfile文件(target/jib-docker-context目录下)
    mvn clean compile jib:exportDockerContext
    docker build -t target/jib-docker-context
    
##2.4生成镜像并打成tar包方便进行镜像传输（target/jib-image.tar）
    mvn clean compile jib:buildTar
    docker load --input target/jib-image.tar
    
##2.5可以讲jib指令绑定到maven的生命周期(讲build绑定到package阶段)
    <plugin>
        <excutions>
            <excution>
                <phase>package</phase>
                <goals>
                    <goal>build</goal>
                </goals>
            </excution>
        </excutions>
    </plugin>