# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure(2) do |config|
  config.vm.box = "ubuntu/xenial64"

  config.vm.network "forwarded_port", guest: 8080, host: 8080

   config.vm.provision "file", source: "target/hello-world.war", destination: "/tmp/hello-world.war"
   config.vm.provision "shell", inline: <<-SHELL
     echo "Starting software install"
     sudo apt update
     sudo apt install -y openjdk-8-jdk
     sudo apt install -y tomcat8
     sudo cp /tmp/hello-world.war /var/lib/tomcat8/webapps
     sudo chown -R tomcat8:tomcat8 /var/lib/tomcat8/webapps
     echo "Done"
   SHELL


end
