package com.heweiming.merlion.cucumber.stepdefs;

import com.heweiming.merlion.MerlionApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MerlionApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
