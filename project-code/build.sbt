organization := "co.wds"

name := "CorsModule"

version := "2.3.0"

scalaVersion := "2.11.1"

resolvers ++= Seq(
  "WDS Artifactory Releases" at "http://artifactory.wdstechnology.com/artifactory/libs-release-local",
  "WDS Artifactory Remote Repos" at "http://artifactory.wdstechnology.com/artifactory/remote-repos",
  "WDS Xi Releases" at "s3://xi-repository/release",
  "WDS Xi Snapshots" at "s3://xi-repository/snapshot"
)

publishTo := Some("WDS Xi Snapshots" at "s3://xi-repository/snapshot")

libraryDependencies ++= Seq(
)     

play.Project.playScalaSettings