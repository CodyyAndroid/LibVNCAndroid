# LibVNCAndroid

> An Android Client Library of [Libvncserver](https://github.com/LibVNC/libvncserver) . use it you can combine it into your program easily.
>>  only support to `target 22` (this will be solved as soon as possible　beacause of android 5.0 permission author)

# How to use
## gradle
### Step 1. Add the JitPack repository to your build file
>Add it in your root build.gradle at the end of repositories:

````
	allprojects {
		repositories {
			...
			maven { url "http://jzaccone.github.io/SlidingMenu-aar" }
			maven { url 'https://jitpack.io' }
		}
	}
````

## Step 2. Add the dependency
````
dependencies {
	        compile 'com.github.CodyyAndroid:LibVNCAndroid:v1.0.1'
	}
````

# maven
## Step 1. Add the JitPack repository to your build file
```
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

## Step 2. Add the dependency
```
<dependency>
	    <groupId>com.github.CodyyAndroid</groupId>
	    <artifactId>LibVNCAndroid</artifactId>
	    <version>v1.0.1</version>
	</dependency>
```

# start jump .
```
 public void goVnc(View view){
        startActivity(new Intent(MainActivity.this , ActivityTabs.class));
    }
```


# [LICENSE](#LICENSE)
    Copyright 2016 codyy 
    
    Licensed under the ＧNU License
    This program is free software; you can redistribute it and/or 
    modify it under the terms of the GNU General Public License as 
    published by the Free Software Foundation; either version 2 of the License, 
    or (at your option) any later version.
    This program is distributed in the hope that it will be useful, 
    but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
    or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for 
    more details.    
    You should have received a copy of the GNU General Public License along with 
    this program; if not, write to the Free Software Foundation,
    Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.dfdf
