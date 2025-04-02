#changed 'Class' to 'class'
class robot:
    def __init__(self, name, battery, batteryamount):
        self.name=name
        self.battery=battery
        self.baterryamount=batteryamount
    def greeting(self):
        print("hello, im a robot, my name is " + self.name)
    def USBC(self):
        #changed 'self.battery += self.batteryamount' to 'self.battery += self.battery'
        self.battery += self.battery
        #changed 'if self.battery => 100:' to 'if self.battery >= 100:'
        if self.battery >= 100:
            self.battery = 100
        #changed 'print("baterry has been charged by " + str(self.baterryamount) + " units")' to 'print("baterry has been charged by " + str(self.baterry) + " units")'
        #changed 'str(self.baterry)' to 'str(self.battery)'
        print("baterry has been charged by " + str(self.battery) + " units")

robo=robot("R2-P2", 100, 30)
robo.greeting()
robo.battery -= robo.baterryamount
print("battery after work:" + str(robo.battery))
robo.USBC()