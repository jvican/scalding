resolvers += Resolver.url("artifactory", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

resolvers ++= Seq(
  "jgit-repo" at "http://download.eclipse.org/jgit/maven",
  "sonatype-releases"  at "https://oss.sonatype.org/content/repositories/releases",
  "Twitter Maven" at "https://maven.twttr.com"
)

addSbtPlugin("com.eed3si9n"       % "sbt-assembly"        % "0.10.2")
addSbtPlugin("com.eed3si9n"       % "sbt-unidoc"          % "0.3.3")
addSbtPlugin("com.github.gseitz"  % "sbt-release"         % "1.0.0")
addSbtPlugin("com.jsuereth"       % "sbt-pgp"             % "1.0.0")
addSbtPlugin("com.twitter"        %% "scrooge-sbt-plugin" % "18.9.0")
addSbtPlugin("com.typesafe"       % "sbt-mima-plugin"     % "0.1.14")
addSbtPlugin("com.typesafe.sbt"   % "sbt-git"             % "0.6.2")
addSbtPlugin("org.scoverage"      % "sbt-scoverage"       % "1.5.0")
addSbtPlugin("org.xerial.sbt"     % "sbt-sonatype"        % "1.0")
addSbtPlugin("org.wartremover"    % "sbt-wartremover"     % "2.1.1")
