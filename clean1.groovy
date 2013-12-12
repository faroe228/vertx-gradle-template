#!/usr/bin/env groovy

ant = new AntBuilder();

ant.delete( dir: '.gradle' )

ant.delete( dir: 'build' )


