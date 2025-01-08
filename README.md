First steps with Scala:

### 1. Install Homebrew (if not already installed)

Open your terminal and run:
`/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"`

After installation, ensure Homebrew is working correctly:
`brew doctor`


### 2. Install Java

Install OpenJDK via Homebrew:
`brew install openjdk`

Add OpenJDK to your environment:
`sudo ln -sfn $(brew --prefix openjdk)/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk.jdk`


### 3. Install Scala
Install Scala:
`brew install scala`

Verify the installation:
`scala -version`


### 4. (Optional) Install SBT (Scala Build Tool)
Install SBT:
`brew install sbt`

Verify SBT installation:
`sbt sbtVersion`


### 5. General Terminal Commands:
`% scalac Book.scala`
`% scala Book.scala`
`% rm *.class`
`% rm *.tasty`