import socket
import sys

raspberryAddress = sys.argv[1]
raspberryPort = int (sys.argv[2])
videoName = sys.argv[3]

s = socket.socket()
s.connect((raspberryAddress, raspberryPort))

print s.recv(1024)
s.send(videoName)

s.close()