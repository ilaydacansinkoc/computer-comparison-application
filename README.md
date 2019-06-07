# Computer Comparison Application

You should
fulfill the concepts of:

```
 Abstract Factory Design Pattern
 Decorator Design Pattern
```
Imagine there are two factories that the first one produces gaming computer devices and the other
produces regular computer devices.

The produced devices are of three types:
 Input Devices
 Output Devices
 Hardware Devices

Input devices are:

```
 Keyboard with attributes:
o numberOfKeys
o hasBacklight
 Mouse with attribute:
o isWireless
```
Output Devices are:

```
 Monitor with attribute:
o inch
 Headphone with attributes:
o isWireless
o hasMicrophone
```
Hardware Devices are:

```
 CPU with attributes:
  o version (for example i5, i7 etc.)
  o frequency (for example 5.4 Ghz)
  
 RAM with attributes:
  o capacity
```
The price of a device and some of the attributes could be determined randomly according to the given
intervals by table. There are also some production rules for these factories below:
```

 Regular Computer Factory produces keyboards without backlight, wireless mouses, only 18 or
21 inch monitors, headphones without microphone, i3 or i5 CPUs, 32, 64 or 128 GB RAMs.

 Gaming Computer Factory produces keyboards with backlight, mouses with wires, monitors
that could be any inch, headphones with microphone, i7 or i5 CPUs, 128 or 256 GB RAMs.

```
_Implement the following scenario by using Decorator Design Pattern._

By default, both factories produce computers with copper cables that has speed 10 mps without taking
any money. The cable could be made from gold which is six times faster than copper cable or could be
made from silver which is four times faster than copper. Gold cable is 500 TL and silver cable is 350 TL.

Assemble both a regular and a gaming computer and compare them by listing their and their devices’
prices in a menu.
