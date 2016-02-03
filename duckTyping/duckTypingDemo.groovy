//Dynamic Duck Typing
class Duck {
	String walk
	String talk
}

class MentalPatient {
	String walk
	String talk
}

def isWalkLikeDuck = { it.walk == 'walk like duck' }
def isTalkLikeDuck = { it.talk == 'qwack' }

def duck = new Duck(walk: "like a duck", talk: "qwack")
def metalPatient = new MentalPatient(walk: "like a duck", talk: "qwack")

[duck, metalPatient].each {
	if( isWalkLikeDuck(it) && isTalkLikeDuck(it) ) {
		println "It's duck"
	}
}