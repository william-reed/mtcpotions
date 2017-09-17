<span style = "color: red">MTCPotions</span>
==========

Bukkit plugin for using designated potions for a certain interval of time

<b>Commands</b>:

  - /plotionlist
    - Lists all of the possible potions you can use with this plugin
  - /potion {type of potion} {duration potion should have effect}
    - Gives the player the designated potion for the designated amount of time
    - <b>NOTE</b> Currently there is a limit set to 10 minutes on the max potion usage time, and a 5 minute cooldown in between usage periods. This will eventually be adjustable ina  config.yml file

<b>Types of Potions MTCPotions supports:</b>
  - fireresistance (makes player immune to fire)
  - invisibility (makes player invisible)
  - night vision (Allows you to see very well during night time)
  - regeneration (Heals the player gradually)
  - strength (Gives player greater strength
  - swiftness (Makes player faster)
  - jump (Allows player to jump higher)
  - haste (Allows player to dig / mine / use arms faster
  - scuba (Allows player to breath underwater)

<b>Permission Nodes</b>
  - potions.*
    - Use of all possible potions
  - potions.use.fireresistance
    - Use of fire resistance potion
  - potions.use.invisibility
    - Use of invisibility potion
  - potions.use.nightvision:
    - Allows you to use night vision potions
  - potions.use.regeneration:
    - Allows you to use regeneration potions
  - potions.use.strength:
    - description: Allows you to use strength potions
  - potions.use.swiftness:
    - Allows you to use swiftness potions
  - potions.use.jump:
    - Allows you to use jump potions
  - potions.use.haste:
    - Allows you to use haste potions
  - potions.use.scuba:
    - Allows you to use scuba potions

<b>To Do:</b>
  - Config file 
  - Allow ediitng of cooldown time
  - Allow editing of max potion time

<b>Original Bukkit Dev Link </b>
https://dev.bukkit.org/projects/mtcpotions
