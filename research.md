---
layout: page-with-nav
title: "Projects"
permalink: /research/
nav: true
nav_order: 4
---

<div class="member-grid">
  
  <div class="member-card">
    <div class="member-image">
      <img src="/images/fakeimage.png" alt="FVS">
    </div>
    <div class="member-content">
      <h3> FindViralStrains</h3>
      <p class="member-role">Ongoing Research</p>
      <div class="member-interests">
        <strong>Keywords:</strong> Viral Genomics, 
      </div>
      <p class="member-bio">Using ILP to examine de bruijn graphs and viral diversity</p>
      
    </div>
  </div>
  <div class="member-card">
    <div class="member-image">
      <img src="/images/fakeimage.png" alt="PTMS2PATHWAYS">
    </div>
    <div class="member-content">
      <h3> PTMS2PATHWAYS</h3>
      <p class="member-role">Ongoing Research</p>
      <div class="member-interests">
        <strong>Keywords:</strong> Cell Signaling Pathways, Mass Spectrometry, R Language
      </div>
      <p class="member-bio">Placeholder text</p>
      
    </div>
  </div>
  
</div>

<style>
/* Grid layout */
.member-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(300px, 1fr));
  gap: 25px;
  margin: 20px 0;
}

/* Member card styling */
.member-card {
  background: white;
  border-radius: 10px;
  overflow: hidden;
  box-shadow: 0 3px 10px rgba(0,0,0,0.1);
  transition: transform 0.2s;
  border: 1px solid #eee;
}

.member-card:hover {
  transform: translateY(-5px);
  box-shadow: 0 5px 15px rgba(0,0,0,0.15);
}

.member-card.alumni {
  opacity: 0.85;
  background: #f9f9f9;
}

/* Image styling */
.member-image {
  height: 200px;
  overflow: hidden;
}

.member-image img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  border-bottom: 3px solid #3498db;
}

.member-card.alumni .member-image img {
  border-bottom-color: #95a5a6;
}

/* Content styling */
.member-content {
  padding: 20px;
}

.member-content h3 {
  margin: 0 0 5px 0;
  color: #2c3e50;
  font-size: 1.3em;
}

.member-role {
  color: #3498db;
  font-weight: 600;
  margin: 0 0 10px 0;
  font-size: 0.95em;
}

.member-card.alumni .member-role {
  color: #7f8c8d;
}

.member-interests {
  background: #f8f9fa;
  padding: 8px 12px;
  border-radius: 5px;
  margin: 10px 0;
  font-size: 0.9em;
  border-left: 3px solid #2ecc71;
}

.member-bio {
  color: #555;
  line-height: 1.5;
  margin: 10px 0 0 0;
  font-size: 0.95em;
}

/* Section headers */
h2 {
  color: #2c3e50;
  margin-top: 40px;
  padding-bottom: 10px;
  border-bottom: 2px solid #eee;
}

/* Responsive */
@media (max-width: 768px) {
  .member-grid {
    grid-template-columns: 1fr;
    gap: 20px;
  }
  
  .member-image {
    height: 180px;
  }
}
</style>
