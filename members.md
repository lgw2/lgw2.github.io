---
layout: page-with-nav
title: ""
permalink: /members/
nav: true
nav_order: 3
---

# Lab Members

## Graduate Students

<div class="member-grid">
  
  <div class="member-card">
    <div class="member-image">
      <img src="/images/members/afra.jpg" alt="Afra N.">
    </div>
    <div class="member-content">
      <h3>Afra</h3>
      <p class="member-role">Masters Student</p>
      <div class="member-interests">
        <strong>Research:</strong> Placeholder Interests
      </div>
      <p class="member-bio">Placeholder text about research focus...</p>
    </div>
  </div>

  <div class="member-card">
    <div class="member-image">
      <img src="/images/members/jack.jpg" alt="Jack dsflk">
    </div>
    <div class="member-content">
      <h3>Jack</h3>
      <p class="member-role">PHD Student</p>
      <div class="member-interests">
        <strong>Research:</strong> Progamming Languages
      </div>
      <p class="member-bio">Placeholder text about research focus...</p>
    </div>
  </div>

</div>

## Undergraduate Students

<div class="member-grid">
  
  <div class="member-card">
    <div class="member-image">
      <img src="/images/members/mikhail.jpg" alt="Mikhail Ukrainetz">
    </div>
    <div class="member-content">
      <h3>Mikhail Ukrainetz</h3>
      <p class="member-role">Undergraduate Student</p>
      <div class="member-interests">
        <strong>Interests:</strong> Linux, Metagenomics, Viruses
      </div>
      <p class="member-bio">Former HPC sys-admin turned researcher</p>
      
    </div>
  </div>

  <div class="member-card">
    <div class="member-image">
      <img src="/images/members/jose.jpg" alt="Jose Rod.">
    </div>
    <div class="member-content">
      <h3>Jose Rod.</h3>
      <p class="member-role">Undergraduate Student</p>
      <div class="member-interests">
        <strong>Interests:</strong> ILP
      </div>
      <p class="member-bio">Placeholder text about interests...</p>
    </div>
  </div>

  <div class="member-card">
    <div class="member-image">
      <img src="/images/members/grant.jpg" alt="Grant Smith">
    </div>
    <div class="member-content">
      <h3>Grant Smith</h3>
      <p class="member-role">Undergraduate Student</p>
      <div class="member-interests">
        <strong>Interests:</strong> Machine learning applications
      </div>
      <p class="member-bio">Placeholder text about interests...</p>
    </div>
  </div>
  
  <div class="member-card">
  <div class="member-image">
    <img src="/images/members/jose.jpg" alt="Maddy">
  </div>
  <div class="member-content">
    <h3>Maddy</h3>
    <p class="member-role">Undergraduate Student</p>
    <div class="member-interests">
      <strong>Interests:</strong> ILP
    </div>
    <p class="member-bio">Placeholder text about interests...</p>
  </div>
</div>

</div>

## Graduated Lab Members

<div class="member-grid">
  
  <div class="member-card alumni">
    <div class="member-image">
      <img src="/images/members/tim.jpg" alt="Tim">
    </div>
    <div class="member-content">
      <h3>Tim</h3>
      <p class="member-role">Alumni</p>
      <div class="member-interests">
        <strong>Former Research:</strong> [Research area]
      </div>
      <p class="member-bio">Graduated [Year]. Currently [current position].</p>
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
