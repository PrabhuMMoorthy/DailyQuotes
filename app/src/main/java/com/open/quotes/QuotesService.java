package com.open.quotes;

import android.content.Context;

public class QuotesService {

    public String getRandomQuote(){
        double randomVal = Math.random();
        long round = Math.round(randomVal * 1000);
        int randomQuoteNumber = (int) (round % 300);
        return getQuote(randomQuoteNumber);
    }

    public String getQuote(int num){
        String text = "";
        switch(num) {
            case 1:
                text = "Everything changes, nothing remains without change";
                break;
            case 2:
                text = "Everything is changeable, everything appears and disappears there is no blissful peace until one passes beyond the agony of life and death";
                break;
            case 3:
                text = "Let yourself be open and life will be easier. A spoon of salt in a glass of water makes the water undrinkable. A spoon of salt in a lake is almost unnoticed";
                break;
            case 4:
                text = "All that we are is the result of what we have thought";
                break;
            case 5:
                text = "Anger will never disappear so long as thoughts of resentment are cherished in the mind. Anger will disappear just as soon as thoughts of resentment are forgotten";
                break;
            case 6:
                text = "Neither fire nor wind, birth nor death can erase our good deeds";
                break;
            case 7:
                text = "No one saves us but ourselves. No one can and no one may. We ourselves must walk the path";
                break;
            case 8:
                text = "A man is not called wise because he talks and talks again; but if he is peaceful, loving and fearless then he is in truth called wise";
                break;
            case 9:
                text = "There is no fire like passion, there is no shark like hatred, there is no snare like folly, there is no torrent like greed";
                break;
            case 10:
                text = "Feelings come and go like clouds in a windy sky. Conscious breathing is my anchor";
                break;
            case 11:
                text = "Just as a snake sheds its skin, we must shed our past over and over again";
                break;
            case 12:
                text = "True love is born from understanding";
                break;
            case 13:
                text = "Long is the night to him who is awake; long is a mile to him who is tired; long is life to the foolish who do not know the true law";
                break;
            case 14:
                text = "You are the community now. Be a lamp for yourselves. Be your own refuge. Seek for no other. All things must pass. Strive on diligently. Don’t give up";
                break;
            case 15:
                text = "It is a man's own mind, not his enemy or foe, that lures him to evil ways";
                break;
            case 16:
                text = "The Way is not in the sky; the Way is in the heart";
                break;
            case 17:
                text = "There is nothing so disobedient as an undisciplined mind, and there is nothing so obedient as a disciplined mind";
                break;
            case 18:
                text = "Know well what leads you forward and what holds you back, and choose the path that leads to wisdom";
                break;
            case 19:
                text = "Three things cannot be long hidden: the sun, the moon, and the truth";
                break;
            case 20:
                text = "Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment";
                break;
            case 21:
                text = "What we think, we become";
                break;
            case 22:
                text = "I never see what has been done; I only see what remains to be done";
                break;
            case 23:
                text = "However many holy words you read, however many you speak, what good will they do you if you do not act on upon them?";
                break;
            case 24:
                text = "To live a pure unselfish life, one must count nothing as one's own in the midst of abundance";
                break;
            case 25:
                text = "Those who are free of resentful thoughts surely find peace";
                break;
            case 26:
                text = "Work out your own salvation. Do not depend on others";
                break;
            case 27:
                text = "Do not overrate what you have received, nor envy others. He who envies others does not obtain peace of mind";
                break;
            case 28:
                text = "To be idle is a short road to death and to be diligent is a way of life; foolish people are idle, wise people are diligent";
                break;
            case 29:
                text = "Whatever words we utter should be chosen with care for people will hear them and be influenced by them for good or ill";
                break;
            case 30:
                text = "Without health life is not life; it is only a state of langour and suffering - an image of death";
                break;
            case 31:
                text = "Virtue is persecuted more by the wicked than it is loved by the good";
                break;
            case 32:
                text = "I do not believe in a fate that falls on men however they act; but I do believe in a fate that falls on them unless they act";
                break;
            case 33:
                text = "We are what we think. All that we are arises with our thoughts. With our thoughts, we make the world";
                break;
            case 34:
                text = "There are only two mistakes one can make along the road to truth; not going all the way, and not starting";
                break;
            case 35:
                text = "Health is the greatest gift, contentment the greatest wealth, faithfulness the best relationship";
                break;
            case 36:
                text = "Peace comes from within. Do not seek it without";
                break;
            case 37:
                text = "Chaos is inherent in all compounded things. Strive on with diligence";
                break;
            case 38:
                text = "A jug fills drop by drop";
                break;
            case 39:
                text = "Even death is not to be feared by one who has lived wisely";
                break;
            case 40:
                text = "You, yourself, as much as anybody in the entire universe, deserve your love and affection";
                break;
            case 41:
                text = "All wrong-doing arises because of mind. If mind is transformed can wrong-doing remain?";
                break;
            case 42:
                text = "Better than a thousand hollow words, is one word that brings peace";
                break;
            case 43:
                text = "Just as a candle cannot burn without fire, men cannot live without a spiritual life";
                break;
            case 44:
                text = "It is better to travel well than to arrive";
                break;
            case 45:
                text = "Hatred does not cease by hatred, but only by love; this is the eternal rule";
                break;
            case 46:
                text = "The mind is everything. What you think you become";
                break;
            case 47:
                text = "To keep the body in good health is a duty... otherwise we shall not be able to keep our mind strong and clear";
                break;
            case 48:
                text = "In a controversy the instant we feel anger we have already ceased striving for the truth, and have begun striving for ourselves";
                break;
            case 49:
                text = "It is better to conquer yourself than to win a thousand battles. Then the victory is yours. It cannot be taken from you, not by angels or by demons, heaven or hell";
                break;
            case 50:
                text = "Better than worshiping gods is obedience to the laws of righteousness";
                break;
            case 51:
                text = "He who walks in the eightfold noble path with unswerving determination is sure to reach Nirvana";
                break;
            case 52:
                text = "With fools, there is no companionship. Rather than to live with men who are selfish, vain, quarrelsome, and obstinate, let a man walk alone";
                break;
            case 53:
                text = "Radiate boundless love towards the entire world";
                break;
            case 54:
                text = "A disciplined mind brings happiness";
                break;
            case 55:
                text = "Give, even if you only have a little";
                break;
            case 56:
                text = "Conquer anger with non-anger. Conquer badness with goodness. Conquer meanness with generosity. Conquer dishonesty with truth";
                break;
            case 57:
                text = "Those who cling to perceptions and views wander the world offending people";
                break;
            case 58:
                text = "Drop by drop is the water pot filled. Likewise, the wise man, gathering it little by little, fills himself with good";
                break;
            case 59:
                text = "I will not look at another’s bowl intent on finding fault: a training to be observed";
                break;
            case 60:
                text = "Let none find fault with others; let none see the omissions and commissions of others. But let one see one’s own acts, done and undone";
                break;
            case 61:
                text = "Should a person do good, let him do it again and again. Let him find pleasure therein, for blissful is the accumulation of good";
                break;
            case 62:
                text = "May all beings have happy minds";
                break;
            case 63:
                text = "Delight in heedfulness! Guard well your thoughts!";
                break;
            case 64:
                text = "Should you find a wise critic to point out your faults, follow him as you would a guide to hidden treasure";
                break;
            case 65:
                text = "Should a seeker not find a companion who is better or equal, let them resolutely pursue a solitary course";
                break;
            case 66:
                text = "In whom there is no sympathy for living beings: know him as an outcast";
                break;
            case 67:
                text = "Hatred is never appeased by hatred in this world. By non-hatred alone is hatred appeased. This is a law eternal";
                break;
            case 68:
                text = "Live with no sense of ‘mine,’ not forming attachment to experiences";
                break;
            case 69:
                text = "Better it is to live one day seeing the rise and fall of things than to live a hundred years without ever seeing the rise and fall of things";
                break;
            case 70:
                text = "One is not called noble who harms living beings. By not harming living beings one is called noble";
                break;
            case 71:
                text = "If a man going down into a river, swollen and swiftly flowing, is carried away by the current — how can he help others across?";
                break;
            case 72:
                text = "All conditioned things are impermanent - when one sees this with wisdom, one turns away from suffering";
                break;
            case 73:
                text = "Ardently do today what must be done. Who knows? Tomorrow, death comes";
                break;
            case 74:
                text = "The world is afflicted by death and decay. But the wise do not grieve, having realised the nature of the world";
                break;
            case 75:
                text = "Resolutely train yourself to attain peace";
                break;
            case 76:
                text = "To support mother and father, to cherish wife and children, and to be engaged in peaceful occupation — this is the greatest blessing";
                break;
            case 77:
                text = "All tremble at violence; all fear death. Putting oneself in the place of another, one should not kill nor cause another to kill";
                break;
            case 78:
                text = "They blame those who remain silent, they blame those who speak much, they blame those who speak in moderation. There is none in the world who is not blamed";
                break;
            case 79:
                text = "Just as the great ocean has one taste, the taste of salt, so also this teaching and discipline has one taste, the taste of liberation";
                break;
            case 80:
                text = "If with a pure mind a person speaks or acts, happiness follows them like a never-departing shadow";
                break;
            case 81:
                text = "As an elephant in the battlefield withstands arrows shot from bows all around, even so shall I endure abuse";
                break;
            case 82:
                text = "The one in whom no longer exist the craving and thirst that perpetuate becoming; how could you track that Awakened one, trackless, and of limitless range";
                break;
            case 83:
                text = "The root of suffering is attachment";
                break;
            case 84:
                text = "Whatever precious jewel there is in the heavenly worlds, there is nothing comparable to one who is Awakened";
                break;
            case 85:
                text = "As a water bead on a lotus leaf, as water on a red lily, does not adhere, so the sage does not adhere to the seen, the heard, or the sensed";
                break;
            case 86:
                text = "It is in the nature of things that joy arises in a person free from remorse";
                break;
            case 87:
                text = "All experiences are preceded by mind, having mind as their master, created by mind";
                break;
            case 88:
                text = "Ceasing to do evil, Cultivating the good, Purifying the heart: This is the teaching of the Buddhas";
                break;
            case 89:
                text = "Understanding is the heartwood of well-spoken words";
                break;
            case 90:
                text = "As I am, so are these. As are these, so am I. Drawing the parallel to yourself, neither kill nor get others to kill";
                break;
            case 91:
                text = "Just as a solid rock is not shaken by the storm, even so the wise are not affected by praise or blame";
                break;
            case 92:
                text = "We will develop love, we will practice it, we will make it both a way and a basis…";
                break;
            case 93:
                text = "There is no fear for one whose mind is not filled with desires";
                break;
            case 94:
                text = "Whatever is not yours: let go of it. Your letting go of it will be for your long-term happiness & benefit";
                break;
            case 95:
                text = "Meditate … do not delay, lest you later regret it";
                break;
            case 96:
                text = "Whatever has the nature of arising has the nature of ceasing";
                break;
            case 97:
                text = "Know from the rivers in clefts and in crevices: those in small channels flow noisily, the great flow silent. Whatever’s not full makes noise. Whatever is full is quiet";
                break;
            case 98:
                text = "If you knew what I know about the power of giving, you would not let a single meal pass without sharing it in some way";
                break;
            case 99:
                text = "Let him not deceive another nor despise anyone anywhere. In anger or ill will let him not wish another ill";
                break;
            case 100:
                text = "Your own self is your master; who else could be? With yourself well controlled, you gain a master very hard to find";
                break;
            case 101:
                text = "Conquer anger through gentleness, unkindness through kindness, greed through generosity, and falsehood by truth";
                break;
            case 102:
                text = "Like someone pointing to treasure is the wise person who sees your faults and points them out. Associate with such a sage";
                break;
            case 103:
                text = "Your work is to discover your work and then with all your heart to give yourself to it";
                break;
            case 104:
                text = "I do not dispute with the world; rather it is the world that disputes with me";
                break;
            case 105:
                text = "You cannot travel the path until you have become the path itself";
                break;
            case 106:
                text = "If we could see the miracle of a single flower clearly, our whole life would change";
                break;
            case 107:
                text = "The only real failure in life is not to be true to the best one knows";
                break;
            case 108:
                text = "The whole secret of existence is to have no fear. Never fear what will become of you, depend on no one. Only the moment you reject all help are you freed";
                break;
            case 109:
                text = "Some do not understand that we must die, But those who do realise this settle their quarrels";
                break;
            case 110:
                text = "With realisation of one's own potential and self-confidence, one can build a better world";
                break;
            case 111:
                text = "Do not give your attention to what others do or fail to do; give it to what you do or fail to do";
                break;
            case 112:
                text = "When we feel love and kindness toward others, it not only makes others feel loved and cared for, but it helps us also to develop inner happiness and peace";
                break;
            case 113:
                text = "By living deeply in the present moment, we can understand the past better and we can prepare for a better future";
                break;
            case 114:
                text = "If anything is worth doing, do it with all your heart";
                break;
            case 115:
                text = "He is able who thinks he is able";
                break;
            case 116:
                text = "Be kind whenever possible. It is always possible";
                break;
            case 117:
                text = "Calm mind brings inner strength and self-confidence, so that's very important for good health";
                break;
            case 118:
                text = "To refrain from evil and from strong drink and to be always steadfast in virtue; this is the good luck";
                break;
            case 119:
                text = "In the sky, there is no distinction of east and west; people create distinctions out of their own minds and then believe them to be true";
                break;
            case 120:
                text = "Endurance is one of the most difficult disciplines, but it is to the one who endures that the final victory comes";
                break;
            case 121:
                text = "Sometimes your joy is the source of your smile, but sometimes your smile can be the source of your joy";
                break;
            case 122:
                text = "Teach this triple truth to all: A generous heart, kind speech, and a life of service an compassion are the things that renew humanity";
                break;
            case 123:
                text = "Anger or hatred is like a fisherman's hook. It is very important for us to ensure that we are not caught by it";
                break;
            case 124:
                text = "All suffering is caused by ignorance. People inflict pain on others in the selfish pursuit of their own happiness or satisfaction";
                break;
            case 125:
                text = "We are shaped by our thoughts; we become what we think. When the mind is pure, joy follows like a shadow that never leaves";
                break;
            case 126:
                text = "He who experiences the unity of life sees his own self in all beings, and all beings in his own self, and looks on everything with an impartial eye";
                break;
            case 127:
                text = "When you practice gratefulness, there is a sense of respect toward others";
                break;
            case 128:
                text = "Be a lamp unto yourself. Work out your liberation with liberation";
                break;
            case 129:
                text = "A dog is not considered a good dog because he is a good barker. A man is not considered a good man because he is a good talker";
                break;
            case 130:
                text = "Follow then the shining ones, the wise, the awakened, the loving, for they know how to work and forbear";
                break;
            case 131:
                text = "It is very important to generate a good attitude, a good heart, as much as possible. From this, happiness in both the short term and the long term for both yourself and others will come";
                break;
            case 132:
                text = "Choose to be optimistic, it feels better";
                break;
            case 133:
                text = "All things appear and disappear because of the concurrence of cause and conditions. Nothing ever exists entirely alone; everything is in relation to everything else";
                break;
            case 134:
                text = "Attention is the rarest and purest form of generosity";
                break;
            case 135:
                text = "Life is available only in the present moment";
                break;
            case 136:
                text = "Be what you are. This is the first step toward becoming better than you are";
                break;
            case 137:
                text = "If you want others to be happy, practice compassion. If you want to be happy, practice compassion";
                break;
            case 138:
                text = "Anger is the ultimate destroyer of your own peace of mind";
                break;
            case 139:
                text = "People have a hard time letting go of their suffering. Out of a fear of the unknown, they prefer suffering that is familiar";
                break;
            case 140:
                text = "An insincere and evil friend is more to be feared than a wild beast; a wild beast may wound your body, but an evil friend will wound your mind";
                break;
            case 141:
                text = "Even if things don't unfold the way you expected, don't be disheartened or give up. One who continues to advance will win in the end";
                break;
            case 142:
                text = "Letting go gives us freedom, and freedom is the only condition for happiness. If, in our heart, we still clint to anything - anger, anxiety, or possessions - we cannot be free";
                break;
            case 143:
                text = "Look at situations from all angles, and you will become more open";
                break;
            case 144:
                text = "To be beautiful means to be yourself. You don't need to be accepted by others. You need to accept yourself";
                break;
            case 145:
                text = "A person, who no matter how desperate the situation, gives others hope, is a true leader";
                break;
            case 146:
                text = "He is not the same, nor is he another";
                break;
            case 147:
                text = "My actions are my only true belongings";
                break;
            case 148:
                text = "Little by little a person becomes evil, as a water pot is filled by drops of water; Little by little a person becomes good, as a water pot is filled by drops of water";
                break;
            case 149:
                text = "Real generosity is doing something nice for someone who will never find out";
                break;
            case 150:
                text = "A family is a place where minds come in contact with one another";
                break;
            case 151:
                text = "The more you are motivated by Love, The more Fearless and Free your action will be";
                break;
            case 152:
                text = "Silence is sometimes the best answer";
                break;
            case 153:
                text = "Because we all share an identical need for love, it is possible to feel that anybody we meet, in whatever circumstances, is a brother or sister";
                break;
            case 154:
                text = "The wise ones fashioned speech with their thought, sifting it as a grain is sifted through a sieve";
                break;
            case 155:
                text = "Those who really seek the path to Enlightenment dictate terms to their mind. Then they proceed with strong determination";
                break;
            case 156:
                text = "As irrigators lead water where they want, as archers make their arrows straight, as carpenters carve wood, the wise shape their minds";
                break;
            case 157:
                text = "It is necessary to combine knowledge born from study with sincere practice in our daily lives. These two must go together";
                break;
            case 158:
                text = "It is not enough to be compassionate, we must act";
                break;
            case 159:
                text = "Love and compassion are necessities, not luxuries. Without them, humanity cannot survive";
                break;
            case 160:
                text = "An open heart is an open mind";
                break;
            case 161:
                text = "People take different roads seeking fulfillment and happiness. Just because they're not on your road doesn't mean they've gotten lost";
                break;
            case 162:
                text = "Because you are alive, everything is possible";
                break;
            case 163:
                text = "To understand everything is to forgive everything";
                break;
            case 164:
                text = "Happiness mainly comes from our own attitude, rather than from external factors";
                break;
            case 165:
                text = "Silence the angry man with love. Silence the ill-natured man with kindness. Silence the miser with generosity. Silence the liar with truth";
                break;
            case 166:
                text = "Believe nothing, no matter where you read it, or who said it, no matter if I have said it, unless it agrees with you own reason and common sense";
                break;
            case 167:
                text = "Like a lovely flower full of colour but lacking in fragrance, are the words of those who do not practice what they teach";
                break;
            case 168:
                text = "Think not lightly of evil, saying 'It will not come to me.' Drop by drop is the water pot filled. Likewise the fool, gathering it little by little, fills himself with evil";
                break;
            case 169:
                text = "If you find no one to support you on the spiritual path, walk alone There is no companionship with the immature";
                break;
            case 170:
                text = "He insulted me, he cheated me, he beat me, he robbed me -- those who are free of resentful thoughts surely find peace";
                break;
            case 171:
                text = "Love is the absence of judgement";
                break;
            case 172:
                text = "A good friend who points out mistakes and imperfections and rebukes evil is to be respected as if he reveals a secret of hidden treasure";
                break;
            case 173:
                text = "Purity or impurity depend on oneself; no one can purify another";
                break;
            case 174:
                text = "Dharma is not upheld by talking about it. Dharma is upheld by living in harmony with it...";
                break;
            case 175:
                text = "See them, floundering in their sense of mind, like fish in the puddles of a dried-up stream - and, seeing this, live with no mine, not forming attachment for states of becoming";
                break;
            case 176:
                text = "A mind unruffled by the vagaries of fortune, from sorrow freed, from defilements cleansed, from fear liberated - this is the greatest blessing";
                break;
            case 177:
                text = "The greatest prayer is patience";
                break;
            case 178:
                text = "Our prime purpose in this life is to help others. And if you can't help them, at least don't hurt them";
                break;
            case 179:
                text = "Do not think of how big the universe is, it will merely hurt your head";
                break;
            case 180:
                text = "Ambition is like love, impatient both of delays and rivals";
                break;
            case 181:
                text = "In order to carry a positive action, we must develop here a positive vision";
                break;
            case 182:
                text = "Leave behind the passive dreaming of a rose-tinted future. The energy of happiness exists in living today with roots sunk firmly in reality's soil";
                break;
            case 183:
                text = "If you love someone but rarely make yourself available to them, that is not true love";
                break;
            case 184:
                text = "True change is within, leave the outside as it is";
                break;
            case 185:
                text = "Our own life has to be our message";
                break;
            case 186:
                text = "Have compassion for all beings, rich and poor alike; each has their suffering. Some suffer too much, others too little";
                break;
            case 187:
                text = "The roots of all goodness lie in the soil of appreciation for goodness";
                break;
            case 188:
                text = "The way to change others' minds is with affection, and not anger";
                break;
            case 189:
                text = "A truly compassionate attitude toward others does not change even if they behave negatively or hurt you";
                break;
            case 190:
                text = "We are here to awaken from our illusion of separateness";
                break;
            case 191:
                text = "A great human revolution in just a single individual will help achieve a change in the destiny of a nation and, further, can even enable a change in the destiny of all humankind";
                break;
            case 192:
                text = "Peace does not mean an absence of conflicts; differences will always be there. Peace means solving these differences through peaceful means; through dialogue, education, knowledge; and through humane ways";
                break;
            case 193:
                text = "Times of luxury do not last long, but pass away very quickly nothing in this world can be long enjoyed";
                break;
            case 194:
                text = "Times of luxury do not last long, but pass away very quickly nothing in this world can be long enjoyed";
                break;
            case 195:
                text = "He who can curb his wrath as soon as it arises, as a timely antidote will check snake's venom that so quickly spreads - such a monk gives up the here and the beyond, just as a serpent sheds its worn-out skin";
                break;
            case 196:
                text = "If you can cultivate the right attitude, your enemies are your best spiritual teachers because their presence provides you with the opportunity to enhance and develop your tolerance, patience and understanding";
                break;
            case 197:
                text = "It is easy to see the faults of others, but difficult to see one's own faults. One shows the faults of other like chaff winnowed in the wind, but one conceals one's own faults as a cunning gambler conceals his dice";
                break;
            case 198:
                text = "The source of love is deep in us and we can help others realise a lot of happiness. One word, one action, one thought can reduce another person's suffering and bring that person joy";
                break;
            case 199:
                text = "When one has the feeling of dislike for evil, when one feels tranquil, one finds pleasure in listening to good teachings; when one has these feelings and appreciates them, one is free of fear";
                break;
            case 200:
                text = "The darkest night is ignorance";
                break;
            case 201:
                text = "One moment can change a day, one day can change a life and one life can change the world";
                break;
            case 202:
                text = "Greater in battle than the man who would conquer a thousand-thousand men, is he who would conquer just one – himself. Better to conquer yourself than others";
                break;
            case 203:
                text = "Thousands of candles can be lit from a single candle, and the life of the candle will not be shortened. Happiness never decreases by being shared";
                break;
            case 204:
                text = "Holding on to anger is like grasping a hot coal with the intent of throwing it at someone else; you are the one who gets burned";
                break;
            case 205:
                text = "Pure-limbed, white-canopied, one-wheeled, the cart roles on. See him that cometh: faultless, stream-cutter, bondless he";
                break;
            case 206:
                text = "Be vigilant; guard your mind against negative thoughts";
                break;
            case 207:
                text = "May all that have life be delivered from suffering";
                break;
            case 208:
                text = "As you walk and eat and travel, be where you are. Otherwise, you will miss most of your life";
                break;
            case 209:
                text = "When the Aggregates arise, decay and die, O bhikkhu, every moment you are born, decay, and die";
                break;
            case 210:
                text = "To insist on a spiritual practice that served you in the past is to carry the raft on your back after you have crossed the river";
                break;
            case 211:
                text = "Analysing through special insight and realising the lack of inherent existence constitute understanding of the signless";
                break;
            case 212:
                text = "Even as a solid rock is unshaken by the wind, so are the wise unshaken by praise or blame";
                break;
            case 213:
                text = "Remembering a wrong is like carrying a burden on the mind";
                break;
            case 214:
                text = "Imagine that every person in the world is enlightened but you. They are all your teachers, each doing just the right things to help you learn perfect patience, perfect wisdom, perfect compassion";
                break;
            case 215:
                text = "For the good of the many, for the happiness of the many, out of compassion for the world";
                break;
            case 216:
                text = "If the selflessness of phenomena is analysed and if this analysis is cultivated, it causes the effect of attaining nirvana. Through no other cause does one come to peace";
                break;
            case 217:
                text = "How blissful it is, for one who has nothing. Attainers-of-wisdom are people with nothing. See him suffering, one who has something, a person bound in mind with people";
                break;
            case 218:
                text = "This I tell you: decay is inherent in all conditioned things. Work out your own salvation, with diligence";
                break;
            case 219:
                text = "Life is a river always flowing. Do not hold onto things. Work hard";
                break;
            case 220:
                text = "The wise man makes an island of himself that no flood can overwhelm";
                break;
            case 221:
                text = "Our theories of the eternal are as valuable as are those that a chick which has not broken its way through its shell might form of the outside world";
                break;
            case 222:
                text = "Victory breeds hatred. The defeated live in pain. Happily the peaceful live, giving up victory and defeat";
                break;
            case 223:
                text = "There isn’t enough darkness in all the world to snuff out the light of one little candle";
                break;
            case 224:
                text = "Contentment is the greatest wealth";
                break;
            case 225:
                text = "Just to say ‘I believe’ or ‘I do not doubt’ does not mean that you understand and see. To force oneself to see and accept a thing without understanding is political and not spiritual or intellectual";
                break;
            case 226:
                text = "Every experience, no matter how bad it seems, holds within it a blessing of some kind. The goal is to find it";
                break;
            case 227:
                text = "Let us rise up and be thankful, for if we didn’t learn a lot at least we learned a little, and if we didn’t learn a little, at least we didn’t get sick, and if we get sick, at least we didn’t die; so, let us all be thankful";
                break;
            case 228:
                text = "Friendship is the only cure for hatred, the only guarantee of peace";
                break;
            case 229:
                text = "Happiness comes when your work and words are of benefit to others";
                break;
            case 230:
                text = "The one who has conquered himself is a far greater hero than he who has defeated a thousand times a thousand men";
                break;
            case 231:
                text = "He has no need for faith who knows the uncreated, who has cut off rebirth, who has destroyed any opportunity for good or evil, and cast away all desire. He is indeed the ultimate man";
                break;
            case 232:
                text = "Be greatly aware of the present";
                break;
            case 233:
                text = "If you truly loved yourself, you could never hurt another";
                break;
            case 234:
                text = "He who experiences the unity of life sees his own Self in all beings, and all beings in his own Self, and looks on everything with an impartial eye";
                break;
            case 235:
                text = "What you think, you become. What you feel, you attract. What you imagine, you create";
                break;
            case 236:
                text = "As a flower that is lovely and beautiful, but is scentless, even so, fruitless is the well-spoken word of one who practices it not";
                break;
            case 237:
                text = "As a lotus flower is born in water, grows in water and rises out of water to stand above it unsoiled, so I, born in the world, raised in the world having overcome the world, live unsoiled by the world";
                break;
            case 238:
                text = "Those which are produced from causes are not produced. They do not have an inherent nature of production. Those which depend on causes are said to be empty; those who know emptiness are aware";
                break;
            case 239:
                text = "When you like a flower, you just pluck it. But when you love a flower, you water it daily";
                break;
            case 240:
                text = "Doubt everything. Find your own light";
                break;
            case 241:
                text = "You throw thorns, falling in my silence they become flowers";
                break;
            case 242:
                text = "The Gift of Truth excels all other Gifts";
                break;
            case 243:
                text = "As rain falls equally on the just and the unjust, do not burden your heart with judgments but rain your kindness equally on all";
                break;
            case 244:
                text = "Meditate, Ānanda, do not delay, or else you will regret it later. This is our instruction to you";
                break;
            case 245:
                text = "The foot feels the foot when it feels the ground";
                break;
            case 246:
                text = "If you light a lamp for somebody, it will also brighten your path";
                break;
            case 247:
                text = "To live in the consciousness of the inevitability of suffering, of becoming enfeebled, of old age and of death, is impossible – we must free ourselves from life, from all possible life";
                break;
            case 248:
                text = "Monks, even if bandits were to savagely sever you, limb by limb, with a double-handled saw, even then, whoever of you harbors ill will at heart would not be upholding my teaching";
                break;
            case 249:
                text = "The virtuous man delights in this world and he delights in the next";
                break;
            case 250:
                text = "Kindness should become the natural way of life, not the exception";
                break;
            case 251:
                text = "All descriptions of reality are temporary hypotheses";
                break;
            case 252:
                text = "Most problems, if you give them enough time and space, will eventually wear themselves out";
                break;
            case 253:
                text = "Awake. Be the witness of your thoughts. You are what observes, not what you observe";
                break;
            case 254:
                text = "If you are facing in the right direction, all you need to do is keep on walking";
                break;
            case 255:
                text = "To become vegetarian is to step into the stream which leads to nirvana";
                break;
            case 256:
                text = "The teaching is simple. Do what is right. Be pure";
                break;
            case 257:
                text = "Attachment leads to suffering";
                break;
            case 258:
                text = "Words have the power to both destroy and heal. When words are both true and kind, they can change our world";
                break;
            case 259:
                text = "What we are today comes from our thoughts of yesterday, and present thoughts build our life of tomorrow: our life is the creation of our own mind";
                break;
            case 260:
                text = "She who knows life flows, feels no wear or tear, needs no mending or repair";
                break;
            case 261:
                text = "The past is already gone, the future is not yet here. There’s only one moment for you to live, and that is the present moment";
                break;
            case 262:
                text = "Conquer the angry one by not getting angry; conquer the wicked by goodness; conquer the stingy by generosity, and the liar by speaking the truth";
                break;
            case 263:
                text = "If a traveler does not meet with one who is his better, or his equal, let him firmly keep to his solitary journey; there is no companionship with a fool";
                break;
            case 264:
                text = "Your actions are your only belongings";
                break;
            case 265:
                text = "If you do not change direction, you may end up where you are heading";
                break;
            case 266:
                text = "Speak the truth, do not become angered, and give when asked, even be it a little. By these three conditions, one goes to the presence of the gods";
                break;
            case 267:
                text = "There has to be evil so that good can prove its purity above it";
                break;
            case 268:
                text = "If you knew what I know about the power of giving, you would not let a single meal pass without sharing it in some way";
                break;
            case 269:
                text = "All phenomena do not inherently exist because of being dependent-arisings. All phenomena do not inherently exist because of being dependently imputed";
                break;
            case 270:
                text = "He who loves 50 people has 50 woes; he who loves no one has no woes";
                break;
            case 271:
                text = "From a withered tree, a flower blooms";
                break;
            case 272:
                text = "Opinion, O disciples, is a disease; opinion is a tumor; opinion is a sore. He who has overcome all opinion, O disciples, is called a saint, one who knows";
                break;
            case 273:
                text = "When you come upon a path that brings benefit and happiness to all, follow this course as the moon journeys through the stars";
                break;
            case 274:
                text = "There are no chains like hate… Dwelling on your brother’s faults multiplies your own. You are far from the end of your journey";
                break;
            case 275:
                text = "How wonderful! How wonderful! All things are perfect, exactly as they are";
                break;
            case 276:
                text = "It is a man’s own mind, not his enemy or foe, that leads him to evil ways";
                break;
            case 277:
                text = "Happiness does not depend on what you have or who you are, it solely relies on what you think";
                break;
            case 278:
                text = "Meditate. Live purely. Be quiet. Do your work with mastery. Like the moon, come out from behind the clouds! Shine";
                break;
            case 279:
                text = "There is no path to happiness: happiness is the path";
                break;
            case 280:
                text = "If we fail to look after others when they need help, who will look after us?";
                break;
            case 281:
                text = "Whoever sees me sees the teaching, and whoever sees the teaching sees me";
                break;
            case 282:
                text = "Wear your ego like a loose fitting garment";
                break;
            case 283:
                text = "In the end, only three things matter: how much you loved, how gently you lived, and how gracefully you let go of things not meant for you";
                break;
            case 284:
                text = "Few among men are they who cross to the further shore. The others merely run up and down the bank on this side";
                break;
            case 285:
                text = "Every human being is the author of his own health or disease";
                break;
            case 286:
                text = "Nothing can harm you as much as your own thoughts unguarded";
                break;
            case 287:
                text = "Every morning we are born again. What we do today is what matters most";
                break;
            case 288:
                text = "Praise and blame, gain and loss, pleasure and sorrow come and go like the wind. To be happy, rest like a giant tree in the midst of them all";
                break;
            case 289:
                text = "When you realise how perfect everything is, you will tilt your head back and laugh at the sky";
                break;
            case 290:
                text = "You only lose what you cling to";
                break;
            case 291:
                text = "What you are is what you have been. What you’ll be is what you do now";
                break;
            case 292:
                text = "Following the Noble Path is like entering a dark room with a light in the hand; the darkness will all be cleared away, and the room will be filled with light";
                break;
            case 293:
                text = "There is nothing more dreadful than the habit of doubt. Doubt separates people. It is a poison that disintegrates friendships and breaks up pleasant relations. It is a thorn that irritates and hurts; it is a sword that kills";
                break;
            case 294:
                text = "People with opinions just go around bothering one another";
                break;
            case 295:
                text = "Those which arise dependently are free of inherent existence";
                break;
            case 296:
                text = "In separateness lies the world’s greatest misery; in compassion lies the world’s true strength";
                break;
            case 297:
                text = "The ignorant man is an ox. He grows in size, not in wisdom";
                break;
            case 298:
                text = "Set your heart on doing good. Do it over and over again, and you will be filled with joy";
                break;
            case 299:
                text = "More than those who hate you, more than all your enemies, an undisciplined mind does greater harm";
                break;
            case 300:
                text = "Our life is shaped by our mind, for we become what we think";
                break;
            case 301:
                text = "Learn this from water: loud splashes the brook but the oceans depth are calm";
                break;
            case 302:
                text = "Though one should live a hundred years without wisdom and control, yet better, indeed, is a single day’s life of one who is wise and meditative";
                break;
            case 303:
                text = "Nothing is forever except change";
                break;
            case 304:
                text = "Success isn’t the key to happiness. Happiness is the key to success";
                break;
            case 305:
                text = "Whatever a monk keeps pursuing with his thinking and pondering, that becomes the inclination of his awareness";
                break;
            case 306:
                text = "If you propose to speak, always ask yourself, is it true, is it necessary, is it kind";
                break;
            case 307:
                text = "Those who have failed to work toward the truth have missed the purpose of living";
                break;
            case 308:
                text = "Rule your mind or it will rule you";
                break;
            case 309:
                text = "Meditation brings wisdom; lack of meditation leaves ignorance. Know well what leads you forward and what hold you back, and choose the path that leads to wisdom";
                break;
            case 310:
                text = "Many do not realise that we here must die. For those who realise this, quarrels end";
                break;
            case 311:
                text = "Perhaps the deepest reason why we are afraid of death is because we do not know who we are";
                break;
            case 312:
                text = "The non-doing of any evil, the performance of what's skillful, the cleansing of one's own mind: this is the teaching of the Awakened";
                break;
            case 313:
                text = "Is it timely? Is it necessary? Is it kind?";
                break;
            case 314:
                text = "Whatever an enemy might do to an enemy, or a foe to a foe, the ill-directed mind can do to you even worse";
                break;
            case 315:
                text = "Who leaves behind all human bonds And has cast off the bonds of heaven, Detached from all bonds everywhere: He is the one I call a brahmin";
                break;
            case 316:
                text = "The growth of wisdom may be measured exactly by the diminution of ill temper";
                break;
            case 317:
                text = "The trouble is, you think you have time";
                break;
            case 318:
                text = "Greater still is the truth of our connectedness";
                break;
            case 319:
                text = "Live every act fully, as if it were your last";
                break;
            case 320:
                text = "Above all, do not lose your desire to walk";
                break;
            case 321:
                text = "It is possible to live 24 hours in a state of love";
                break;
            case 322:
                text = "The universe itself is change and life itself is but what you deem it";
                break;
            case 323:
                text = "Patience is the highest asceticism";
                break;
            case 324:
                text = "The moment you see how important it is to love yourself, you will stop making others suffer";
                break;
            case 325:
                text = "Joy comes not through possession or ownership but through a wise and loving heart";
                break;
            case 326:
                text = "Ambition is like love, impatient of both delays and rivals";
                break;
            case 327:
                text = "I shall live here in the rains, There in winter, Elsewhere in summer,\" muses the fool, Not aware of the nearness of death";
                break;
            case 328:
                text = "Better it is to live alone; there is no fellowship with a fool. Live alone and do no evil; be carefree like an elephant in the elephant forest";
                break;
            case 329:
                text = "You don't gather the beauty of a flower by plucking her petals";
                break;
            case 330:
                text = "Tune as the sitthar, neither high nor low, and we will dance away the hearts of men";
                break;
            case 331:
                text = "In life we cannot avoid change, we cannot avoid loss. Freedom and happiness are found in the flexibility and ease with which we move through change";
                break;
            case 332:
                text = "Delightful are forests Where the public does not delight. There the passion-free delight, Not seeking sensual pleasure";
                break;
            case 333:
                text = "It’s your road… and yours alone… Others may walk it with you, but no one can walk it for you. No matter what path you choose, really walk it";
                break;
            case 334:
                text = "Emotion arise from Desire, hence an Illusion";
                break;
            case 335:
                text = "The less you have, the less you have to worry about";
                break;
            case 336:
                text = "The rain could turn to gold and still your thirst would not be slaked. Desire is unquenchable or it ends in tears, even in heaven";
                break;
            case 337:
                text = "Love yourself and watch --- today, tomorrow, and always";
                break;
            case 338:
                text = "Analysing through special insight and realising the lack of inherent existence constitute understanding of the signless";
                break;
            case 339:
                text = "A man asked Gautama Buddha, \"I want happiness.\" Buddha said, \"First remove \"I,\" that's Ego, then remove \"want,\" that's Desire. See now you are left with only \"Happiness\"";
                break;
            case 340:
                text = "Virtuous people always let go. They don't prattle about pleasures and desires. Touched by happiness and then by suffering, The sage shows no sign of being elated or depressed";
                break;
            case 341:
                text = "Sensual craving gives rise to grief; Sensual craving gives rise to fear. For someone released from sensual craving There is no grief; And from where would be fear?";
        }
        return  text +"\n\n~ Buddha";
    }
}
