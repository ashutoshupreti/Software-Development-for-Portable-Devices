import socket      
from subprocess import Popen

 
s = socket.socket()         
print "Socket successfully created"

port = 12345               

s.bind(('', port))        
print "socket binded to %s" %(port)
 
s.listen(5)     
print "socket is listening"           
 
while True:
 
   # Establish connection with client.
   c, addr = s.accept()     
   print 'Got connection from', addr
 
   # send a thank you message to the client. 
   c.send('Thank you for connecting. Your video is being played...')
   movie_path = c.recv(1024)
   os.system('vlc ' + movie_path)
   # omxp = Popen(['omxplayer',movie_path])
 
   # Close the connection with the client
   c.close()  